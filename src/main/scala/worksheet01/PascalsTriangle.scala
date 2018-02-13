package worksheet01

object PascalsTriangle {

  def rows(rows: Int): List[Any] = {
    rows match {
      case 0 => List.empty
      case _ => List(List(rows))
    }
  }
}
