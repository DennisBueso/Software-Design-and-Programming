package designpatterns.structural.proxy.protectedproxy

object TestProtectionProxy extends App {
  val owner: Owner = new Owner()
  val employee: Employee = new Employee()
  owner.setReportGenerator(reportGenerator)
  var reportGenerator: ReportGeneratorProxy =
    new ReportGeneratorProtectionProxy(owner)
  reportGenerator = new ReportGeneratorProtectionProxy(employee)
  employee.setReportGenerator(reportGenerator)
  println("For owner:")
  println(owner.generateDailyReport())
  println("For employee:")
  println(employee.generateDailyReport())
}
