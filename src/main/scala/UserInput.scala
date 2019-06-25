package chatbot

trait UserInput {
  def read(): String
}

import scala.io.StdIn

object ConsoleInput extends UserInput{
  override def read(): String = {
    StdIn.readLine("bot:>")
  }

}
