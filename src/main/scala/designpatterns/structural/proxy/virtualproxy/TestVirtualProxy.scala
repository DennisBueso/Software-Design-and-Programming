package designpatterns.structural.proxy.virtualproxy

object TestVirtualProxy extends App {
  val company: Company =
    Company("ABC Company", "Alabama", "011-2845-8965", contactList)
  val empList = contactList.employeeList
  println("Company Name: " + company.companyName)
  println("Company Address: " + company.companyAddress)
  println("Company Contact No.: " + company.companyContactNo)
  println("Requesting for contact list")
  contactList = company.contactList
  var contactList: ContactList = new ContactListProxyImpl()
  for (emp <- empList) {
    println(emp)
  }
}
