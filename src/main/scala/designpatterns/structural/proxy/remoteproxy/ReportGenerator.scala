package designpatterns.structural.proxy.remoteproxy

import java.rmi.{Remote, RemoteException}

trait ReportGenerator extends Remote {
  @throws(classOf[RemoteException])
  def generateDailyReport(): String
}
