package designpatterns.structural.decorator

abstract class PizzaDecorator(pizza: Pizza) extends Pizza {
  override def getDesc: String = pizza.getDesc + ", "

  override def getPrice: Double = pizza.getPrice
}
