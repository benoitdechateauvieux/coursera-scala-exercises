package week6

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by benoit on 1/31/16.
  */

@RunWith(classOf[JUnitRunner])
class NQueensSuite extends FunSuite {

  import NQueens._

  test("4 queens") {
    val queens = List(0, 3, 1)
    assert(isSafe(2, queens))
    assert(!isSafe(0, queens))
    assert(!isSafe(1, queens))
    assert(!isSafe(3, queens))
  }

  test("2 queens") {
    val queens = List(3, 1)
    assert(isSafe(0, queens))
    assert(!isSafe(1, queens))
    assert(!isSafe(2, queens))
    assert(!isSafe(3, queens))
  }

}
