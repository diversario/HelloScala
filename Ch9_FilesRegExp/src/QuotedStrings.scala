import scala.io.Source
import scala.util.matching.Regex
import java.io.File

class QuotedStrings {
  val rx = new Regex("""("[^"]*")""")

  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

  def search = {
    val dirs = subdirs(new File("."))
    val files = (for (d <- dirs) yield d.listFiles.filter(f => """.scala$""".r.findFirstIn(f.getName).toList.length > 0)).flatten

    for (f <- files) {
      val fileContent = Source.fromFile(f).getLines().mkString
      val matched = rx.findAllMatchIn(fileContent)
      for (m <- matched) println(m)
    }
  }
}

object QuotedStrings extends App {
  val qs = new QuotedStrings
  qs.search
}