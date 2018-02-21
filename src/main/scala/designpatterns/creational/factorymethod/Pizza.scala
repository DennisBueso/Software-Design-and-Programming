package designpatterns.creational.factorymethod

trait Pizza {
  def getName: String

  def bake(): Unit
}

class NewYorkStylePizza extends Pizza {
  override def bake(): Unit = println(s"Baking $getName pizza.")

  override def getName: String = "New York Style"
}

class ChicagoStylePizza extends Pizza {
  override def bake(): Unit = println(s"Baking $getName pizza.")

  override def getName: String = "Chicago Deep Dish"
}
