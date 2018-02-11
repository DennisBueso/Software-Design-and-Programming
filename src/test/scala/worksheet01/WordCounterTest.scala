package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class WordCounterTest extends FlatSpec with Matchers {
  "A Word Counter" should "count one word" in {
    val wordCount = WordCounter.countwords("word")
    wordCount should be(Map("word" -> 1))
  }
}
