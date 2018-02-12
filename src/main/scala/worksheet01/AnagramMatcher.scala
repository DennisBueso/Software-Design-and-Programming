package worksheet01

object AnagramMatcher {

  def matchWord(anagrams: Set[String], word: String): Set[String] = {
    anagrams.filter(i => i.toLowerCase != word.toLowerCase &&
      i.toLowerCase.sorted.equals(word.toLowerCase.sorted))
  }
}
