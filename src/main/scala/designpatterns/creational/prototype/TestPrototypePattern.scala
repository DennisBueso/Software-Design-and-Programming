package designpatterns.creational.prototype

object TestPrototypePattern extends App {
  val managerAccessControl: AccessControl =
    AccessControlProvider.getAccessControlObject("MANAGER")
  var userAccessControl: AccessControl =
    AccessControlProvider.getAccessControlObject("USER")
  println("*" * 20)
  println(user)

  userAccessControl = AccessControlProvider.getAccessControlObject("USER")
  user = new User("User B", "USER Level", userAccessControl)

  println("Changing access control of: " + user.userName)

  user.accessControl.access = "READ REPORTS"
  println(user)
  println("*" * 20)
  var user = new User("User A", "USER Level", userAccessControl)
  user = new User("User C", "MANAGER Level", managerAccessControl)
  println(user)
}
