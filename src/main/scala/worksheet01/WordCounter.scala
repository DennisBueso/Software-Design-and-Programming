package worksheet01

object WordCounter {

  def countWords(phrase: String): Map[String, Int] = {
    phrase.toLowerCase.split("[^a-z0-9]+").groupBy(identity).mapValues(_.length)
  }
}
