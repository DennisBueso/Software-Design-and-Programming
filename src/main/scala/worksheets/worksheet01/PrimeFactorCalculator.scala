package worksheets.worksheet01

object PrimeFactorCalculator {

  def primeFactors(input: Long): List[Long] = {

    def calculate(remainder: Long, divisor: Long = 2): List[Long] = {
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
