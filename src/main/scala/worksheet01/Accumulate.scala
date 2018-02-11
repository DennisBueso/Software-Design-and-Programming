package worksheet01

class Accumulate {
  def accumulate[T, R](collection: List[T], function: T => R): List[R] = {
    collection match {
      case _ => List.empty
    }
  }
}
