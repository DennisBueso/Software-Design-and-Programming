package designpatterns.structural.composite

case class HtmlElement(s: String) extends HtmlTag(s) {
  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def generateHtml(): Unit = println(s"$startTag$tagBody$endTag")
}
