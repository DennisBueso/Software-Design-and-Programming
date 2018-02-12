package worksheet01

object SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int = {
    Vector.range(1, limit).filter(f => factors.exists(f % _ == 0)).sum
  }
}
