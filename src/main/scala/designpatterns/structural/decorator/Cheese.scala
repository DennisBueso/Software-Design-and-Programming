package designpatterns.structural.decorator

class Cheese(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    null
  }

  def getPrice: Double = {
    0
  }
}
