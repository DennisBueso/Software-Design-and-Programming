package designpatterns.creational.builder.immutable

object SedanCarBuilder extends CarBuilder {
  val sedan = Car(
    carType = "SEDAN",
    bodyStyle = "External dimensions: overall length (inches): 202.9,\n" +
      "   overall width (inches): 76.2, overall height (inches): 60.7,\n" +
      "   wheelbase (inches): 112.9, front track (inches): 65.3,\n" +
      "   rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5",
    power = "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm",
    engine = "3.5L Duramax V 6 DOHC",
    breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution",
    seats = "Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats",
    windows = "Laminated side windows.Fixed rear window with defroster",
    fuelType = "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
  )

  override def getCar: Car = sedan
}
