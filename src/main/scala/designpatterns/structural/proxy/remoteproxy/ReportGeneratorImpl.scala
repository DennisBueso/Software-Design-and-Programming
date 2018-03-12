package designpatterns.structural.proxy.remoteproxy

import java.rmi.server.UnicastRemoteObject
import java.rmi.{Naming, RemoteException}

object ReportGeneratorImpl extends App {
  try {
    val reportGenerator: ReportGenerator = new ReportGeneratorImpl()
    Naming.rebind("PizzaCoRemoteGenerator", reportGenerator)
  } catch {
    case e: Exception => e.printStackTrace()
  }
}

class ReportGeneratorImpl protected() extends UnicastRemoteObject with ReportGenerator {

  override def generateDailyReport(): String = try {
    "********************Location X Daily Report********************\n" +
      "Location ID: 012\n" +
      "Today's Date: Sun Sep 39 00:11:23 GMT 2016\n" +
      "Total Pizza Sell: 112\n" +
      "Total Sale: $2534\n" +
      "Net Profit: $1985\n" +
      "***************************************************************"
  }
  catch {
    case e: RemoteException => e.getMessage
  }
}
