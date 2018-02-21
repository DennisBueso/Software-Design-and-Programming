package designpatterns.creational.factorymethod

object PizzaTestDrive {
  def main(args: Array[String]): Unit = {
    val newYorkStore = new NewYorkPizzaStore
    val chicagoStore = new ChicagoPizzaStore
    newYorkStore.orderPizza("Pepperoni and Extra Cheese")
    chicagoStore.orderPizza("Hawaiian")
  }
}
