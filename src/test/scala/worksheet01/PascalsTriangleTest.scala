package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class PascalsTriangleTest extends FlatSpec with Matchers {

  "A Pascal's Triangle" should "compute a triangle with zero rows" in {
    PascalsTriangle.rows(0) should be(List.empty)
  }

  it should "compute a triangle with a single row" in {
    PascalsTriangle.rows(1) should be(List(List(1)))
  }

  it should "compute a triangle with a two rows" in {
    PascalsTriangle.rows(2) should be(List(List(1), List(1, 1)))
  }
}
