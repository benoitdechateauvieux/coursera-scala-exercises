package week4


/**
  * Created by benoit on 3/20/16.
  */

trait List[+T] {
  def isEmpty : scala.Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}

object Nil extends List[Nothing]{
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  def isEmpty = true
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

object List {
  def apply[T](): List[T] = Nil
  def apply[T](x: T) = new Cons(x, Nil)
  def apply[T](x: T, y: T) = new Cons(x, new Cons(y, Nil))
}