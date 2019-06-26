package modes

import java.time.format.DateTimeFormatter

import chatbot.{ChatbotMode, EffectsProvider, Failed, LineStepResult, Processed}

object CurrentDay extends  ChatbotMode{
  override def process(message: String, effects: EffectsProvider): LineStepResult = {
    if (message =="today"){
      val currentDate = effects.currentDate()
      val message = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"))
      Processed(message, this, false)
    }else{
      Failed()
    }
  }
}
