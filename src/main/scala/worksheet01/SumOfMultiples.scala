package worksheet01

object SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int = {
    Vector.range(1, limit).filter(i => factors.exists(i % _ == 0)).sum
  }
}
