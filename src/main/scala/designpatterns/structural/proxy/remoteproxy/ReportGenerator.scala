package designpatterns.structural.proxy.remoteproxy

import java.rmi.Remote

trait ReportGenerator extends Remote {
  def generateDailyReport(): String
}
