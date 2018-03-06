package designpatterns.structural.composite

abstract class HtmlTag(tagName: String) {
  var startTag = ""
  var endTag = ""
  var tagBody = ""
  var children = List.empty[HtmlTag]

  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String): Unit = this.tagBody = tagBody

  def addChildTag(htmlTag: HtmlTag): Unit = children = children :+ htmlTag

  def removeChildTag(htmlTag: HtmlTag): Unit = children = children.filter(!_.equals(htmlTag))

  def getChildren: List[HtmlTag] = children

  def generateHtml()
}
