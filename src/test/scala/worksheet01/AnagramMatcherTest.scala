package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class AnagramMatcherTest extends FlatSpec with Matchers {

  "An Anagram Matcher" should "detect no matches" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("hello", "world", "zombies", "pants"), "diaper")
    anagramMatch should be(Set.empty)
  }

  it should "detect a simple anagram" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("tan", "stand", "at"), "ant")
    anagramMatch should be(Set("tan"))
  }
}
