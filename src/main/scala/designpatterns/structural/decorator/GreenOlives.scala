package designpatterns.structural.decorator

class GreenOlives(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    null
  }

  def getPrice: Double = {
    0
  }
}
