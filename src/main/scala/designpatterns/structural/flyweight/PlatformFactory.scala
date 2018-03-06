package designpatterns.structural.flyweight

import scala.collection.mutable

object PlatformFactory {
  private val map: mutable.Map[String, Platform] = mutable.Map.empty

  def getPlatformInstance(platformType: String): Platform = {
    map.getOrElseUpdate(platformType, {
      platformType match {
        case "SCALA" => new ScalaPlatform
        case "C" => new CPlatform
        case "JAVA" => new JavaPlatform
        case "RUBY" => new RubyPlatform
      }
    })
  }
}
