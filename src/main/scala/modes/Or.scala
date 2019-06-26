package modes

import chatbot.{ ChatbotMode, EffectsProvider, Failed, LineStepResult, Processed}

case class Or(first:ChatbotMode, second: ChatbotMode) extends ChatbotMode {
  override def process(message: String, effects: EffectsProvider): LineStepResult = {
    first.process(message, effects) match {
      case Processed(answer,nextMode, endOfDialog)
      => Processed(answer, Or(nextMode, second), endOfDialog)
      case Failed() => second.process(message,effects) match {
        case Processed(answer, nextMode, endOfDialog) => Processed(answer, Or(nextMode, first), endOfDialog)
        case Failed() => Failed()
      }
    }
  }
}
