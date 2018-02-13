package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class PascalsTriangleTest extends FlatSpec with Matchers {

  "A Pascal's Triangle" should "not compute a triangle with zero rows" in {
    PascalsTriangle.rows(0) should be(List.empty)
  }

  it should "compute a triangle with a single row" in {
    PascalsTriangle.rows(1) should be(List(List(1)))
  }

  it should "compute a triangle with two rows" in {
    PascalsTriangle.rows(2) should be(List(List(1), List(1, 1)))
  }

  it should "compute a triangle with three rows" in {
    PascalsTriangle.rows(3) should be(List(List(1), List(1, 1), List(1, 2, 1)))
  }

  it should "compute a triangle with four rows" in {
    PascalsTriangle.rows(4) should be(List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1)))
  }

  it should "compute a triangle with five rows" in {
    PascalsTriangle.rows(5) should be(List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1),
      List(1, 4, 6, 4, 1)))
  }

  it should "compute a triangle with six rows" in {
    PascalsTriangle.rows(6) should be(List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1),
      List(1, 4, 6, 4, 1), List(1, 5, 10, 10, 5, 1)))
  }

  it should "compute a triangle with ten rows" in {
    PascalsTriangle.rows(10) should be(List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1),
      List(1, 4, 6, 4, 1), List(1, 5, 10, 10, 5, 1), List(1, 6, 15, 20, 15, 6, 1),
      List(1, 7, 21, 35, 35, 21, 7, 1), List(1, 8, 28, 56, 70, 56, 28, 8, 1),
      List(1, 9, 36, 84, 126, 126, 84, 36, 9, 1)))
  }

  it should "not compute a triangle with negative rows" in {
    PascalsTriangle.rows(-1) should be(List.empty)
  }
}
