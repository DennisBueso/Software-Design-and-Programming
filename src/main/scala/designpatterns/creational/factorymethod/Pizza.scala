package designpatterns.creational.factorymethod

// Product
trait Pizza {
  def getName: String

  def bake(): Unit
}

// Concrete Product
class NewYorkStylePizza extends Pizza {
  override def bake(): Unit = println(s"Baking $getName pizza.")

  override def getName: String = "New York Style"
}

// Concrete Product
class ChicagoStylePizza extends Pizza {
  override def bake(): Unit = println(s"Baking $getName pizza.")

  override def getName: String = "Chicago Deep Dish"
}
