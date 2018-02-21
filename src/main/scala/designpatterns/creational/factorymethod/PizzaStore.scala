package designpatterns.creational.factorymethod

trait PizzaStore {
  def orderPizza(order: String): Unit = {
    val pizza = createPizza
    println(s"Ordering a ${pizza.getName} $order pizza.")
    pizza.bake()
  }

  def createPizza: Pizza
}

class NewYorkPizzaStore extends PizzaStore {
  override def createPizza: Pizza = new NewYorkStylePizza
}

class ChicagoPizzaStore extends PizzaStore {
  override def createPizza: Pizza = new ChicagoStylePizza
}
