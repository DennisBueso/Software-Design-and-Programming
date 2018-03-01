package designpatterns.creational.prototype

case class User(userName: String, level: String, accessControl: AccessControl) {
  override def toString: String = s"Name: $userName, Level: $level, " + accessControl.toString
}
