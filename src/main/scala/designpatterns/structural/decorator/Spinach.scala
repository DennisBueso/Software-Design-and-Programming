package designpatterns.structural.decorator

class Spinach(pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + "Spinach (7.92)"

  override def getPrice: Double = super.getPrice + 7.92
}
