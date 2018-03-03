package designpatterns.structural.decorator

class SimplyVegPizza extends Pizza {
  override def getDesc: String = "SimplyVegPizza (230)"

  override def getPrice: Double = 230
}
