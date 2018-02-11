package worksheet01

object Accumulator {
  def accumulate[T, R](collection: List[T], function: T => R): List[R] = {
    collection match {
      case head :: tail => function(head) :: accumulate(tail, function)
      case _ => List.empty
    }
  }
}
