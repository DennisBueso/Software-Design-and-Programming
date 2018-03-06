package designpatterns.structural.bridge

case class GearLocking(s: String) extends Product {
  override def produce(): Unit = println(s"Producing $productName")

  override def productName: String = s
}
