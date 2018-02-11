package worksheet01

object WordCounter {

  def countWords(phrase: String): Map[String, Int] = {
    phrase.split(" |,").groupBy(identity).mapValues(_.length)
  }
}
