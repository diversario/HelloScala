import scala.io.Source

class FloatingPointNumbers (filename: String) {
  val _numbers = Source.fromFile(filename).getLines().mkString.split("\\s+")
  val numbers = _numbers.map(_.toDouble)

  def sum = numbers.sum
  def average = sum / numbers.length
  def max = numbers.max
  def min = numbers.min
}

object FloatingPointNumbers extends App {
  val fp = new FloatingPointNumbers("floatingnumbers.txt")

  println(fp.sum)
  println(fp.average)
  println(fp.max)
  println(fp.min)
}