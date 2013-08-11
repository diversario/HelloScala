import scala.io.Source
import java.io.PrintWriter

class ReverseLines {
  def reverse(filename: String) = {
    val lines = Source.fromFile(filename).getLines().toArray.reverse
    val out = new PrintWriter(filename)

    for (l <- lines) out.println("%s".format(l))
    out.close()
  }
}

object ReverseLines extends App {
  val rl = new ReverseLines
  rl.reverse("reverselines.txt")
}