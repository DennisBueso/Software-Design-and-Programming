package designpatterns.structural.decorator

class Ham(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    null
  }

  def getPrice: Double = {
    0
  }
}
