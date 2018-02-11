package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class AccumulatorTest extends FlatSpec with Matchers {

  "An accumulator" can "accept an empty List" in {
    val accumulation = Accumulator.accumulate[Int, Int](List.empty, x => x * x)
    accumulation should be(List.empty)
  }

  it can "square a List of Ints" in {
    val accumulation = Accumulator.accumulate[Int, Int](List(1, 2, 3), x => x * x)
    accumulation should be(List(1, 4, 9))
  }

  it can "convert a List of Strings to uppercase" in {
    val accumulation = Accumulator.accumulate[String, String](List("hello", "world"), _.toUpperCase)
    accumulation should be(List("HELLO", "WORLD"))
  }

  it can "reverse a List of Strings" in {
    val accumulation = Accumulator.accumulate[String, String](List("the", "quick", "brown",
      "fox", "etc"), _.reverse)
    accumulation should be(List("eht", "kciuq", "nworb", "xof", "cte"))
  }

  it can "accumulate an accumulation" in {
    val accumulation = Accumulator.accumulate[String, List[String]](List("a", "b", "c"),
      x => Accumulator.accumulate(List(1, 2, 3), y => x + y)).flatten
    accumulation should be(List("a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"))
  }

  it can "accumulate to a different return type" in {
    val accumulation = Accumulator.accumulate[Int, String](List(1, 2, 3), _.toString)
    accumulation should be(List("1", "2", "3"))
  }
}
