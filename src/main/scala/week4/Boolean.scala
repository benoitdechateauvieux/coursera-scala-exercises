package week4

/**
  * Created by benoit on 3/24/16.
  */
abstract class Boolean {
  def ifThenElse[T](t: => T, e: => T): T

  def && (x: => scala.Boolean): scala.Boolean = ifThenElse(x, false)
  def || (x: => scala.Boolean): scala.Boolean = ifThenElse(true, x)

  def <  (x: => scala.Boolean): scala.Boolean = ifThenElse(false, x)

}
