package worksheets.worksheet01

object PascalsTriangle {

  def rows(size: Int): List[List[Int]] = {
    (1 to size).map(buildRow).toList
  }

  def buildRow(row: Int): List[Int] = {
    (1 until row).scan(1) { (acc, column) => acc * (row - column) / column }.toList
  }
}
