package designpatterns.structural.proxy.remoteproxy

import java.rmi.Naming
import java.rmi.server.UnicastRemoteObject

object ReportGeneratorImpl extends App {
  try {
    val reportGenerator: ReportGenerator = new ReportGeneratorImpl()
    Naming.rebind("PizzaCoRemoteGenerator", reportGenerator)
  } catch {
    case e: Exception => e.printStackTrace()
  }
}

class ReportGeneratorImpl protected()
  extends UnicastRemoteObject
    with ReportGenerator {

  override def generateDailyReport(): String = ???
}
