package worksheets.worksheet01

import org.scalatest.{FlatSpec, Matchers}

class PrimeFactorCalculatorTest extends FlatSpec with Matchers {

  "A Prime Factor Calculator" should "calculate that 1 has no prime factors" in {
    PrimeFactorCalculator.primeFactors(1) should be(List.empty)
  }

  it should "calculate that a prime number has exactly one prime factor" in {
    PrimeFactorCalculator.primeFactors(2) should be(List(2))
  }

  it should "calculate that a square of a prime has exactly one prime factor repeated twice" in {
    PrimeFactorCalculator.primeFactors(9) should be(List(3, 3))
  }

  it should "calculate that a cube of a prime has exactly one prime factor repeated thrice" in {
    PrimeFactorCalculator.primeFactors(8) should be(List(2, 2, 2))
  }

  it should "ensure that a product of primes and non-primes is factored properly" in {
    PrimeFactorCalculator.primeFactors(12) should be(List(2, 2, 3))
  }

  it should "ensure that a product of small primes is factored properly" in {
    PrimeFactorCalculator.primeFactors(901255) should be(List(5, 17, 23, 461))
  }

  it should "ensure that a product of small and large primes is factored properly" in {
    PrimeFactorCalculator.primeFactors(93819012551L) should be(List(11, 9539, 894119))
  }
}
