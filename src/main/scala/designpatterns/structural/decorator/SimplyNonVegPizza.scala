package designpatterns.structural.decorator

class SimplyNonVegPizza extends Pizza {
  override def getDesc: String = "SimplyNonVegPizza (350)"

  override def getPrice: Double = 350
}
