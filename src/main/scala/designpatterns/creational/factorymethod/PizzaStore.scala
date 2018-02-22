package designpatterns.creational.factorymethod

// Creator
trait PizzaStore {
  def orderPizza(order: String): Unit = {
    val pizza = createPizza
    println(s"Ordering a ${pizza.getName} $order pizza.")
    pizza.bake()
  }

  // Factory Method
  def createPizza: Pizza
}

// Concrete Creator
class NewYorkPizzaStore extends PizzaStore {
  override def createPizza: Pizza = new NewYorkStylePizza
}

// Concrete Creator
class ChicagoPizzaStore extends PizzaStore {
  override def createPizza: Pizza = new ChicagoStylePizza
}
