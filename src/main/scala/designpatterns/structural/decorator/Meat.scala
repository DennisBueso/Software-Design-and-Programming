package designpatterns.structural.decorator

class Meat(pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + "Meat (14.25)"

  override def getPrice: Double = super.getPrice + 14.25
}
