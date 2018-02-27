package designpatterns.creational.builder.mutable

trait CarBuilder {
  def buildBodyStyle()

  def buildPower()

  def buildEngine()

  def buildBreaks()

  def buildSeats()

  def buildWindows()

  def buildFuelType()

  def getCar: Car
}
