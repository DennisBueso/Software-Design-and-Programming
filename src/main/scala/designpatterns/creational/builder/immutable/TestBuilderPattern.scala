package designpatterns.creational.builder.immutable

object TestBuilderPattern {
  def main(args: Array[String]) {
    val sedanDirector: CarDirector = CarDirector(SedanCarBuilder)
    println(sedanDirector.carBuilder.getCar)
    val sportsDirector: CarDirector = CarDirector(SportsCarBuilder)
    println(sportsDirector.carBuilder.getCar)
  }
}
