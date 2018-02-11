package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class AccumulateTest extends FlatSpec with Matchers {

  val testAccumulate = new Accumulate

  "An accumulate object" can "accept an empty collection" in {
    val accumulation = testAccumulate.accumulate[Int, Int](List.empty, x => x * x)
  }
}
