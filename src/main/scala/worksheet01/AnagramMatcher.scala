package worksheet01

object AnagramMatcher {

  def matchWord(anagrams: Set[String], word: String): Set[String] = {
    val wordToMatch = word.sorted
    anagrams.filter(i => i.sorted.equals(wordToMatch))
  }
}
