package worksheet01

object PrimeFactorCalculator {

  def primeFactors(input: Int): List[Int] = {

    def calculate(remainder: Int, divisor: Int = 2): List[Int] = {
      if (remainder < 2) {
        List.empty
      } else {
        remainder % divisor match {
          case 0 => divisor :: calculate(remainder / divisor, divisor)
          case _ => calculate(remainder, divisor + 1)
        }
      }
    }

    calculate(input)
  }
}
