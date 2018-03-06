package designpatterns.structural.bridge

abstract class Car(product: Product, carType: String) {
  def assemble(): Unit = {
    println(s"Modifying product ${product.productName} according to $carType")
    println(s"Assembling ${product.productName} for $carType")
  }

  def produceProduct(): Unit = product.produce()

  def printDetails(): Unit = println(s"Car: $carType, Product: ${product.productName}")
}
