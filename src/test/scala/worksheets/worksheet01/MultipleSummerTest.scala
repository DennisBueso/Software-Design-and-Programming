package worksheets.worksheet01

import org.scalatest.{FlatSpec, Matchers}

class MultipleSummerTest extends FlatSpec with Matchers {

  "A Multiple Summer" should "sum multiples of 3 or 5 up to 1" in {
    val multiplesSum = MultipleSummer.sum(Set(3, 5), 1)
    multiplesSum should be(0)
  }

  it should "sum multiples of 3 or 5 up to 4" in {
    val multiplesSum = MultipleSummer.sum(Set(3, 5), 4)
    multiplesSum should be(3)
  }

  it should "sum multiples of 3 up to 7" in {
    val multiplesSum = MultipleSummer.sum(Set(3), 7)
    multiplesSum should be(9)
  }

  it should "sum multiples of 3 or 5 up to 10" in {
    val multiplesSum = MultipleSummer.sum(Set(3, 5), 10)
    multiplesSum should be(23)
  }

  it should "sum multiples of 3 or 5 up to 100" in {
    val multiplesSum = MultipleSummer.sum(Set(3, 5), 100)
    multiplesSum should be(2318)
  }

  it should "sum multiples of 3 or 5 up to 1000" in {
    val multiplesSum = MultipleSummer.sum(Set(3, 5), 1000)
    multiplesSum should be(233168)
  }

  it should "sum multiples of 7, 13 or 17 up to 20" in {
    val multiplesSum = MultipleSummer.sum(Set(7, 13, 17), 20)
    multiplesSum should be(51)
  }

  it should "sum multiples of 4 or 6 up to 15" in {
    val multiplesSum = MultipleSummer.sum(Set(4, 6), 15)
    multiplesSum should be(30)
  }

  it should "sum multiples of 5, 6 or 8 up to 150" in {
    val multiplesSum = MultipleSummer.sum(Set(5, 6, 8), 150)
    multiplesSum should be(4419)
  }

  it should "sum multiples of 5 or 25 up to 51" in {
    val multiplesSum = MultipleSummer.sum(Set(5, 25), 51)
    multiplesSum should be(275)
  }

  it should "sum multiples of 43 or 47 up to 10000" in {
    val multiplesSum = MultipleSummer.sum(Set(43, 47), 10000)
    multiplesSum should be(2203160)
  }

  it should "sum multiples of 1 up to 100" in {
    val multiplesSum = MultipleSummer.sum(Set(1), 100)
    multiplesSum should be(4950)
  }

  it should "sum multiples of an empty set up to 10000" in {
    val multiplesSum = MultipleSummer.sum(Set.empty, 10000)
    multiplesSum should be(0)
  }
}
