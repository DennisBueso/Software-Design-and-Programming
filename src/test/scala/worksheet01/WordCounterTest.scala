package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class WordCounterTest extends FlatSpec with Matchers {

  "A Word Counter" should "count one word" in {
    val wordCount = WordCounter.countWords("word")
    wordCount should be(Map("word" -> 1))
  }

  it should "count one of each word" in {
    val wordCount = WordCounter.countWords("one of each")
    wordCount should be(Map("one" -> 1, "of" -> 1, "each" -> 1))
  }

  it should "count multiple occurrences of a word" in {
    val wordCount = WordCounter.countWords("one fish two fish red fish blue fish")
    wordCount should be(Map("one" -> 1, "fish" -> 4, "two" -> 1, "red" -> 1, "blue" -> 1))
  }

  it should "count cramped lists of words" in {
    val wordCount = WordCounter.countWords("one,two,three")
    wordCount should be(Map("one" -> 1, "two" -> 1, "three" -> 1))
  }
}
