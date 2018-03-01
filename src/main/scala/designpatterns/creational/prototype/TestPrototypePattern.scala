package designpatterns.creational.prototype

object TestPrototypePattern extends App {
  var userAccessControl: AccessControl = AccessControlProvider.getAccessControlObject("USER")
  var user = User("User A", "USER Level", userAccessControl)
  println("*" * 20)
  println(user)

  userAccessControl = AccessControlProvider.getAccessControlObject("USER")
  user = User("User B", "USER Level", userAccessControl)

  println("Changing access control of: " + user.userName)

  user.accessControl.access = "READ REPORTS"
  println(user)
  println("*" * 20)

  val managerAccessControl: AccessControl = AccessControlProvider.getAccessControlObject("MANAGER")
  user = User("User C", "MANAGER Level", managerAccessControl)
  println(user)
}
