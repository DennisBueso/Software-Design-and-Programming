package designpatterns.structural.decorator

class GreenOlives(pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + "Green Olives (5.47)"

  override def getPrice: Double = super.getPrice + 5.47
}
