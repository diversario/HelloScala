abstract class Shape {
  def centerPoint: Any
}

class Circle(_x: Int, _y: Int, _r: Int) extends Shape {
  var x = _x
  var y = _y
  var radius = _r

  def centerPoint = (x, y)
}

class Rectangle(_x: Int, _y: Int, _w: Int, _h: Int) extends Shape {
  var x = _x
  var y = _y
  var width = _w
  var height = _h

  def centerPoint = (x + width/2, y + height/2)
}

object Shapes extends App {
  var c = new Circle(1, 2, 3)
  var r = new Rectangle(3, 4, 10, 20)

  printf("Circle: %s, Rect: %s", c.centerPoint, r.centerPoint)
}
