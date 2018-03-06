package designpatterns.structural.bridge

case class CentralLocking(s: String) extends Product {
  override def produce(): Unit = println(s"Producing $productName")

  override def productName: String = s
}
