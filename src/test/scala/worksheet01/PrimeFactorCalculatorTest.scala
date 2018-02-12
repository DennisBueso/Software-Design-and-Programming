package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class PrimeFactorCalculatorTest extends FlatSpec with Matchers {

  "A Prime Factor Calculator" should "calculate that 1 has no prime factors" in {
    PrimeFactorCalculator.primeFactors(1) should be(List.empty)
  }
}
