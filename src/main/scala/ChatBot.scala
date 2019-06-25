package chatbot

import ChatBoot.CurrentTime

import scala.io.StdIn

object ChatBot {

  val effects = DefaultEffects

  def main(args: Array[String]): Unit = {

    val nombre = StdIn.readLine("Hola me llamo ChatBTX. ")
    println(s"Hola $nombre, cierrame con bye o dime cualquier cosa")

    var mode = CurrentTime
    val c = Processed("",mode,false)


    while(!c.endOfDialog){
      c = c.nextMode.process(effects.input.read(),effects) match {
        case Processed(_,_,_) =>
        case Failed() => Processed("No entiendo esta instrucción", c.nextMode, false)
      }
    }
  }
}
