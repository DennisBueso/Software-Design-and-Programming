package designpatterns.creational.prototype

trait Prototype extends Cloneable {
  def cloneIt(): AccessControl
}
