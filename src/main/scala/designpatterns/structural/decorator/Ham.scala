package designpatterns.structural.decorator

class Ham(pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + "Ham (18.12)"

  override def getPrice: Double = super.getPrice + 18.12
}
