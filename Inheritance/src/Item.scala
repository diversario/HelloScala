abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(_pr: Double, _desc: String) extends Item {
  val price = _pr
  val description = _desc
}

class Bundle extends Item {
  var items: Array[Item] = Array()

  def add(i: Item) {
    items = items :+ i
  }

  def price = items.map(_.price).sum
  def description = "Bundle of crap"
}

object Bundles extends App {
  var b = new Bundle

  b.add(new SimpleItem(4f, "some shit"))

  printf("Bundle price: %f, description: %s, items: %d%n", b.price, b.description, b.items.length)
}