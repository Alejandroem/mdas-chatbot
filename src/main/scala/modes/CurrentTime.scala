package ChatBoot

import java.time.format.DateTimeFormatter

import chatbot.{ChatbotMode, EffectsProvider, Failed, Processed}


object Bye extends ChatbotMode {
  override def process ( message: String, effects: EffectsProvider) = {
    if (message =="time"){
      val currentTime = effects.currentTime()
      val message = effects.currentTime.format(DateTimeFormatter.ofPattern("HH:mm"))
      Processed(message, this, false)
    }else{
      Failed()
    }
  }

}
