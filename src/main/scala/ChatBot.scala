
import ChatBoot.{Bye, CurrentTime}
import chatbot.{DefaultEffects, Failed, Processed}
import modes.CurrentDay

import scala.io.StdIn

object ChatBot {

  val effects = DefaultEffects

  def main(args: Array[String]): Unit = {

    val nombre = StdIn.readLine("Hola me llamo ChatBTX. ¿Cómo te llamas? ")
    println(s"Hola $nombre, cierrame con bye o dime cualquier cosa")

    var mode = CurrentDay
    var c = Processed("",mode,false)


    while(!c.endOfDialog){
      c = c.nextMode.process(effects.input.read(),effects) match {
        case next@Processed(_,_,_) => next
        case Failed() => Processed("No entiendo esta instrucción", c.nextMode, false)
      }
      effects.output.writeln(c.answer)
    }
  }
}
