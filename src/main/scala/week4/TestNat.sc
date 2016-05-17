
trait Expr {
  def eval(): Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
  }

  def show(): String = this match {
    case Number(n) => n.toString
    case Var(n) => n
    case Sum(e1, e2) => e1.show +" + "+ e2.show
    case Prod(e1, e2) => {
      if (e1.isInstanceOf[Sum]) {
        "("+e1.show +") * "+ e2.show
      } else {
        e1.show +" * "+ e2.show
      }
    }
  }

}

case class Number(val numValue: Int) extends Expr{}

case class Var(val varName: String) extends Expr{}

case class Sum(val leftOp:Expr, val rightOp:Expr) extends Expr{}

case class Prod(val leftOp:Expr, val rightOp:Expr) extends Expr{}

Number(2).eval
Sum(Number(2),Number(3)).eval
Sum(Number(2),Number(3)).show
Prod(Number(2),Number(3)).show

Sum(Prod(Number(2), Var("x")), Var("y")).show
Prod(Sum(Number(2), Var("x")), Var("y")).show


