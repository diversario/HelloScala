import scala.io.Source
import java.io.PrintWriter

class TabsToSpaces {
  val regexp = """\t""".r

  def convert(filename: String) = {
    val lines = Source.fromFile(filename).getLines().toArray
    val out = new PrintWriter("replaced_" ++ filename)

    val replacedLines = lines.map(regexp.replaceAllIn(_, "  "))

    for (l <- replacedLines) out.println(l)
    out.close()
  }
}

object TabsToSpaces extends App {
  val ts = new TabsToSpaces

  ts.convert("tabstospaces.txt")
}