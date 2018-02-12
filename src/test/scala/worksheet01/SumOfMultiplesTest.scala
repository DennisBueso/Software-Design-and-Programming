package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class SumOfMultiplesTest extends FlatSpec with Matchers {

  "A SumOfMultiples object" should "sum multiples of 3 or 5 up to 1" in {
    val multiplesSum = SumOfMultiples.sum(Set(3, 5), 1)
    multiplesSum should be(0)
  }

  it should "sum multiples of 3 or 5 up to 4" in {
    val multiplesSum = SumOfMultiples.sum(Set(3, 5), 4)
    multiplesSum should be(3)
  }

  it should "sum multiples of 3 up to 7" in {
    val multiplesSum = SumOfMultiples.sum(Set(3), 7)
    multiplesSum should be(9)
  }
}
