package designpatterns.structural.proxy.virtualproxy

import scala.collection.mutable.ListBuffer

trait ContactList {
  def employeeList: ListBuffer[Employee]
}
