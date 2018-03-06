package designpatterns.structural.proxy.remoteproxy

import java.rmi.Naming

object ReportGeneratorClient extends App {
  // YOUR CODE GOES HERE
}

class ReportGeneratorClient {
  def generateReport(): Unit = {
    try {
      val reportGenerator: ReportGenerator = Naming
        .lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator")
        .asInstanceOf[ReportGenerator]
      println(reportGenerator.generateDailyReport())
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}
