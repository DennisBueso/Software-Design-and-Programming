package designpatterns.structural.flyweight

object PlatformFactory {

  private var map: Map[String, Platform] = ???

  def getPlatformInstance(platformType: String): Platform = ???

  // this method will probably need to be synchronized

}
