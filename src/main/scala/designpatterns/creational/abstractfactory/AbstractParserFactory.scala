package designpatterns.creational.abstractfactory

trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser
}

class NYCParserFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "NYCERROR" => print("NYC Parsing Error XML\nNYC ")
      new ErrorXMLParser
    case "NYCFEEDBACK" => print("NYC Parsing Feedback XML\nNYC ")
      new FeedbackXMLParser
    case "NYCORDER" => print("NYC Parsing Order XML\nNYC ")
      new OrderXMLParser
    case "NYCRESPONSE" => print("NYC Parsing Response XML\nNYC ")
      new ResponseXMLParser
  }
}

class LondonParserFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "LondonERROR" => print("London Parsing Error XML\nLondon ")
      new ErrorXMLParser
    case "LondonFEEDBACK" => print("London Parsing Feedback XML\nLondon ")
      new FeedbackXMLParser
    case "LondonORDER" => print("London Parsing Order XML\nLondon ")
      new OrderXMLParser
    case "LondonRESPONSE" => print("London Parsing Response XML\nLondon ")
      new ResponseXMLParser
  }
}
