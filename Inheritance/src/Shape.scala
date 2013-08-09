abstract class Shape(__x: Int, __y: Int) {
  protected var _x = __x
  protected var _y = __y

  def x = _x
  def y = _y

  def move(newX: Int, newY: Int) = {
    _x = newX
    _y = newY
  }
}

class Circle(x: Int, y: Int, rad: Int) extends Shape(x, y) {
  var radius = rad
}

object Shapes extends App {
  val c = new Circle(0,0,10)

  c.move(2, -3)

  printf("x: %d, y: %d", c.x, c.y)
}