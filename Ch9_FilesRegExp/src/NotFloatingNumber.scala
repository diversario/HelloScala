import scala.io.Source

class NotFloatingPointNumbers (filename: String) {
  def notNumbers = Source.fromFile(filename).getLines().mkString.split("\\s+").filter(f => """^\d+\.\d+$""".r.findFirstIn(f).toList.length == 0)
}

object NotFloatingPointNumbers extends App {
  val fp = new NotFloatingPointNumbers("notfloatingnumbers.txt")

  for (l <- fp notNumbers) println(l)
}