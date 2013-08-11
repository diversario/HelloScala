class Point (_x: Int, _y: Int) {
  val x = _x
  val y = _y
}

class LabeledPoint(_x: Int, _y: Int, _l: String) extends Point(_x, _y) {
  val label = _l
}

object Point extends App {
  val p = new LabeledPoint(2, 3, "label")
  printf("%d, %d, %s%n", p.x, p.y, p.label)
}