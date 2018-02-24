package worksheets.worksheet01

object MultipleSummer {

  def sum(factors: Set[Int], limit: Int): Int = {
    Range(1, limit).filter(i => factors.exists(i % _ == 0)).sum
  }
}
