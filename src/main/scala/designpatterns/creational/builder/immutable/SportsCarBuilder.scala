package designpatterns.creational.builder.immutable

object SportsCarBuilder extends CarBuilder {
  val sports = Car(
    carType = "SPORTS",
    bodyStyle = "External dimensions: overall length (inches): 192.3,\n" +
      "   overall width (inches): 75.5, overall height (inches): 54.2,\n" +
      "   wheelbase (inches): 112.3, front track (inches): 63.7,\n" +
      "   rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7",
    power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm",
    engine = "3.6L V 6 DOHC and variable valve timing",
    breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution.\n" +
      "   Stability control",
    seats = "Driver sports front seat with one power adjustments manual height,\n" +
      "   front passenger seat sports front seat with one power adjustments",
    windows = "Front windows with one-touch on two windows",
    fuelType = "Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range"
  )

  override def getCar: Car = sports
}
