package designpatterns.structural.decorator

class Cheese(pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + "Cheese (20.72)"

  override def getPrice: Double = super.getPrice + 20.72
}
