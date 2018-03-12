package designpatterns.structural.proxy.virtualproxy

case class Employee(var employeeName: String,
                    var employeeSalary: Double,
                    var employeeDesignation: String) {
  override def toString: String = s"Employee Name: $employeeName, EmployeeDesignation: " +
    s"$employeeDesignation, Employee Salary: $employeeSalary"
}
