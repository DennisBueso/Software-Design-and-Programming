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

  it should "not detect false positives" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("eagle"), "galea")
    anagramMatch should be(Set.empty)
  }

  it should "detect two anagrams" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("stream", "pigeon", "maters"), "master")
    anagramMatch should be(Set("maters", "stream"))
  }

  it should "not detect anagram subsets" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("dog", "goody"), "good")
    anagramMatch should be(Set.empty)
  }

  it should "detect longer anagrams" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("enlists", "google", "inlets", "banana"),
      "listen")
    anagramMatch should be(Set("inlets"))
  }

  it should "detect three anagrams" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("gallery", "ballerina", "regally", "clergy",
      "largely", "leading"), "allergy")
    anagramMatch should be(Set("gallery", "largely", "regally"))
  }

  it should "not detect identical word as anagram" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("corn", "dark", "Corn", "rank", "CORN", "cron",
      "park"), "corn")
    anagramMatch should be(Set("cron"))
  }

  it should "not detect non-anagrams with identical checksums" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("last"), "mass")
    anagramMatch should be(Set.empty)
  }

  it should "disregard case when detecting anagrams" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("cashregister", "Carthorse", "radishes"),
      "Orchestra")
    anagramMatch should be(Set("Carthorse"))
  }

  it should "detect anagrams using a case-insensitive subject" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("cashregister", "carthorse", "radishes"),
      "Orchestra")
    anagramMatch should be(Set("carthorse"))
  }

  it should "detect anagrams using case-insensitive candidates" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("cashregister", "Carthorse", "radishes"),
      "orchestra")
    anagramMatch should be(Set("Carthorse"))
  }

  it should "not detect an identical word with mixed casing as an anagram" in {
    val anagramMatch = AnagramMatcher.matchWord(Set("Banana"), "banana")
    anagramMatch should be(Set.empty)
  }
}
