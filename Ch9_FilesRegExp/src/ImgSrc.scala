import scala.io.Source

class ImgSrc {
  def load(url: String) = {
    val content = Source.fromURL(url).mkString
    val images = """<(\s*img[^>]*)>""".r.findAllMatchIn(content)

    for (img <- images) yield """src\s*="?(.*)"?""".r.findFirstIn(img.toString).getOrElse("")
  }
}

object ImgSrc extends App {
  val is = new ImgSrc

  val s = is.load("http://yahoo.com")
  for (a <- s) println(a)
}