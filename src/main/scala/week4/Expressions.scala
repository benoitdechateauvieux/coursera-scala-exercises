package week4

/**
  * Created by benoit on 3/28/16.
  */
trait Expr {
  def isSum: scala.Boolean
  def isNumber: scala.Boolean
  //isVariable
  //isProd
  //varNam
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr

  def eval(): String = this match {
    case Number(n) => n.toString
    case Sum(e1, e2) => e1.eval + e2.eval
  }

}

case class Number(val numValue: Int) extends Expr{
  //isVariable
  //isProd
  //varNam
  override def isSum = false
  override def isNumber = true
  override def rightOp = throw new Error("Number.rightOp")
  override def leftOp = throw new Error("Number.leftOp")
}

case class Sum(val leftOp:Expr, val rightOp:Expr) extends Expr{
  //isVariable
  //isProd
  //varNam
  override def isNumber = false
  override def isSum = true
  override def numValue = throw new Error("Sum.numValue")
}
