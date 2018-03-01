package designpatterns.creational.prototype

case class AccessControl(controlLevel: String, var access: String) {
  override def toString: String = s"Access Control Level: $controlLevel, Access: $access"
}
