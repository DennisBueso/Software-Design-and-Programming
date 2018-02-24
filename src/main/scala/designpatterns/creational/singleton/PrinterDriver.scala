package designpatterns.creational.singleton

object PrinterDriver {
  println(s"Initializing with object: $this")

  def print(): Unit = println(s"Printing with object: $this")
}

object PrinterDriverExample {
  def main(args: Array[String]): Unit = {
    println("Start")
    PrinterDriver.print()
    PrinterDriver.print()
  }
}
