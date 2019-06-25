import scala.io.StdIn

object ChatBot {
  def main(args: Array[String]): Unit = {

    //bucle infinito de escucha
    /*
    mientras no_bye
    pido termino
    proceso termino
    fin mientras
     */
    val nombre = StdIn.readLine("Hola me llamo ChatBTX. ")
    println(s"Hola $nombre, cierrame con bye o dime cualquier cosa")
º
  }
}
