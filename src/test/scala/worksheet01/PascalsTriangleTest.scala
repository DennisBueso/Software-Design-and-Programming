package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class PascalsTriangleTest extends FlatSpec with Matchers {

  "A Pascal's Triangle" should "compute a triangle of zero rows" in {
    PascalsTriangle.rows(0) should be(List.empty)
  }
}
