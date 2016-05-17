package week3

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by benoit on 1/31/16.
  */

@RunWith(classOf[JUnitRunner])
class IntSetSuite extends FunSuite {

  import IntSets._

  test("union 1 and 2 contains 1 and 2") {
    val set1 = new NonEmpty(1, Empty, Empty)
    val set2 = new NonEmpty(2, Empty, Empty)
    val union = set1 union set2
    println(set1)
    println(set2)
    println(union.toString)
    assert(union contains(1))
    assert(union contains(2))
  }

  test("union 1,2 and 3 contains 1, 2 and 3") {
    val set2and3 = new NonEmpty(2, Empty, new NonEmpty(3, Empty, Empty))
    val set1 = new NonEmpty(1, Empty, Empty)
    val union = set2and3 union set1
    println(set2and3)
    println(set1)
    println(union.toString)
    assert(union contains(1))
    assert(union contains(2))
    assert(union contains(3))
  }

  test("union 1 and 1 contains 1") {
    val set1one = new NonEmpty(1, Empty, Empty)
    val set1two = new NonEmpty(1, Empty, Empty)
    val union = set1one union set1two
    println(set1one)
    println(set1two)
    println(union.toString)
    assert(union contains(1))
  }

  test("union 1,2 and 1 contains 1 and 2") {
    val set1and2 = new NonEmpty(1, Empty, new NonEmpty(2, Empty, Empty))
    val set1 = new NonEmpty(1, Empty, Empty)
    val union = set1and2 union set1
    println(set1and2)
    println(set1)
    println(union.toString)
    assert(union contains(1))
    assert(union contains(2))
  }

}
