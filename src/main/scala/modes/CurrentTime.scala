package modes

import chatbot.{ChatbotMode, EffectsProvider, Failed, Processed}


object Bye extends ChatbotMode {
  override def process ( message: String, effects: EffectsProvider) = {
    if (message =="bye"){
      val message = "Chao user"
      Processed(message, this, true)
    }else{
      Failed()
    }
  }

}
