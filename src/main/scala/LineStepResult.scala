package chatbot

sealed trait LineStepResult

case class Processed(answer: String, nextMode: ChatbotMode, endOfDialog:Boolean) extends LineStepResult

case class Failed() extends LineStepResult


