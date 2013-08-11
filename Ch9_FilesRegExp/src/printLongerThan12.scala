import scala.io.Source

val lines = Source.fromFile("printLongerThan12.txt").getLines().toArray

for (l <- lines) {
  val m = """([\w]{12,})""".r.findAllMatchIn(l).toArray
  for (l <- m) println(l)
}

