package designpatterns.creational.abstractfactory

trait XMLParser {
  def parse: String
}

class ErrorXMLParser extends XMLParser {
  override def parse: String = "Error XML Message"
}

class FeedbackXMLParser extends XMLParser {
  override def parse: String = "Feedback XML Message"
}

class OrderXMLParser extends XMLParser {
  override def parse: String = "Order XML Message"
}

class ResponseXMLParser extends XMLParser {
  override def parse: String = "Response XML Message"
}
