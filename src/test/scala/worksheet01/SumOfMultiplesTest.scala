package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class SumOfMultiplesTest extends FlatSpec with Matchers {

  "A SumOfMultiples object" should "sum multiples of 3 or 5 up to 1" in {
    val multiplesSum = SumOfMultiples.sum(Set(3, 5), 1)
    multiplesSum should be(0)
  }
}
