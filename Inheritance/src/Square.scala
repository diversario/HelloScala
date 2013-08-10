class Square(_x: Int, _y: Int, _w: Int)
extends java.awt.Rectangle(_x, _y, _w, _w) {
  def this(_w: Int) {
    this(0, 0, _w)
  }

  def this() {
    this(0, 0, 0)
  }
}

object Squares extends App {
  var s = new Square(2, 3, 5)
  printf("%d, %d, %d, %d%n", s.x, s.y, s.width, s.height)

  s = new Square(10)
  printf("%d, %d, %d, %d%n", s.x, s.y, s.width, s.height)

  s = new Square()
  printf("%d, %d, %d, %d%n", s.x, s.y, s.width, s.height)
}