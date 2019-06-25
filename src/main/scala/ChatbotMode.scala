package chatbot

trait ChatbotMode {
  def process(message: String, effects: EffectsProvider): LineStepResult

  def or(other: ChatbotMode) : ChatbotMode = Or(this, other)
}
