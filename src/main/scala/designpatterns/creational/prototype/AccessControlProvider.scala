package designpatterns.creational.prototype

object AccessControlProvider {
  private val map = Map(
    "USER" -> AccessControl("USER", "DO_WORK"),
    "ADMIN" -> AccessControl("ADMIN", "ADD/REMOVE USERS"),
    "MANAGER" -> AccessControl("MANAGER", "GENERATE/READ REPORTS"),
    "VP" -> AccessControl("VP", "MODIFY REPORTS")
  )
  println("Fetching data from external resources and creating access control objects...")

  def getAccessControlObject(controlLevel: String): AccessControl = map(controlLevel).copy()
}
