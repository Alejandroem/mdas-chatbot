package chatbot

trait ChatbotMode {
  def process(messag: String, effects: EffectsProvider)
}
