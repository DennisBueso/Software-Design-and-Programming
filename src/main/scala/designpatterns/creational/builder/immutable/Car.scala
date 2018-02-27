package designpatterns.creational.builder.immutable

case class Car(carType: String = "",
               bodyStyle: String = "",
               power: String = "",
               engine: String = "",
               breaks: String = "",
               seats: String = "",
               windows: String = "",
               fuelType: String = "") {


  override def toString: String = {
    val sb: StringBuilder = new StringBuilder
    sb.append("--------------" + carType + "--------------------- \n")
    sb.append(" Body: ")
    sb.append(bodyStyle)
    sb.append("\n Power: ")
    sb.append(power)
    sb.append("\n Engine: ")
    sb.append(engine)
    sb.append("\n Breaks: ")
    sb.append(breaks)
    sb.append("\n Seats: ")
    sb.append(seats)
    sb.append("\n Windows: ")
    sb.append(windows)
    sb.append("\n Fuel Type: ")
    sb.append(fuelType)
    sb.toString
  }
}
