package designpatterns.creational.builder.mutable

// TODO

object SportsCarBuilder extends CarBuilder {
  val sports = Car("SPORTS")

  override def buildBodyStyle(): Unit = sports.setBodyStyle("External dimensions: overall length (inches): 192.3,\n" +
    "   overall width (inches): 75.5, overall height (inches): 54.2,\n" +
    "   wheelbase (inches): 112.3, front track (inches): 63.7,\n" +
    "   rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7")

  override def buildPower(): Unit = sports.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm")

  override def buildEngine(): Unit = sports.setEngine("3.6L V 6 DOHC and variable valve timing")

  override def buildBreaks(): Unit = sports.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution.\n" +
    "   Stability control")

  override def buildSeats(): Unit = sports.setSeats("Driver sports front seat with one power adjustments manual height,\n" +
    "   front passenger seat sports front seat with one power adjustments")

  override def buildWindows(): Unit = sports.setWindows("Front windows with one-touch on two windows")

  override def buildFuelType(): Unit = sports.setFuelType("Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range")

  override def getCar: Car = sports
}
