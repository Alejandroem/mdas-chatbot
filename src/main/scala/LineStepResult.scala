sealed trait LineStepResult

case class Processed(answer: String, nextMode: Any, endOfDialog:Boolean) extends LineStepResult

case class Failed() extends LineStepResult


