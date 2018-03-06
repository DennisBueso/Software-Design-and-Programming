package designpatterns.structural.proxy.protectedproxy

trait Staff {
  def isOwner: Boolean

  def setReportGenerator(reportGenerator: ReportGeneratorProxy): Unit
}
