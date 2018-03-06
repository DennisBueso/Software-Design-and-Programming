package designpatterns.structural.composite

abstract class HtmlTag(tagName: String) {
  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String) = ???

  def addChildTag(htmlTag: HtmlTag) = ???

  def removeChildTag(htmlTag: HtmlTag) = ???

  def getChildren: List[HtmlTag] = ???

  def generateHtml()
}
