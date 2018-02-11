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

  it should "count expanded lists of words" in {
    val wordCount = WordCounter.countWords("one,\ntwo,\nthree")
    wordCount should be(Map("one" -> 1, "two" -> 1, "three" -> 1))
  }

  it should "ignore punctuation in lists of words" in {
    val wordCount = WordCounter.countWords("car: carpet as java: javascript!!&@$%^&")
    wordCount should be(Map("car" -> 1, "carpet" -> 1, "as" -> 1, "java" -> 1, "javascript" -> 1))
  }

  it should "count numbers as well as words" in {
    val wordCount = WordCounter.countWords("testing, 1, 2 testing")
    wordCount should be(Map("testing" -> 2, "1" -> 1, "2" -> 1))
  }

  it should "disregard case when counting lists of words" in {
    val wordCount = WordCounter.countWords("go Go GO Stop stop")
    wordCount should be(Map("go" -> 3, "stop" -> 2))
  }
}
