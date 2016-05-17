package week4

/**
  * Created by benoit on 3/26/16.
  */
abstract class Nat {
  def intValue: Integer
  def isZero: scala.Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
  override def toString = ""+intValue
}

object Zero extends Nat {
  def intValue= 0
  def isZero = true
  def predecessor = throw new NoSuchElementException("Zero.predecessor")
  def successor = new Succ(this)
  def + (that: Nat) = that
  def - (that: Nat) = if (that.isZero) this else throw new NoSuchElementException("Zero.-")
}

class Succ(val predecessor: Nat) extends Nat {
  def intValue = predecessor.intValue+1
  def isZero = false
  def successor = new Succ(this)
  def + (that: Nat) = new Succ(this.predecessor + that)
  def - (that: Nat) = if (that.isZero) this else this.predecessor - that.predecessor
}
