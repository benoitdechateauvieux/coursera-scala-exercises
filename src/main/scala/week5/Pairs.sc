val pair = ("answer", 42)

val (label, value) = pair

val suite = List(1, 2, 3)

val (x :: y) = suite

val monTuple: scala.Tuple2[String, Int] = ("label", 2)

def merge(xs: List[Int], ys: List[Int]) : List[Int] =
  (xs, ys) match {
    case (a, Nil) => a
    case (Nil, b) => b
    case (x :: xs1, y :: ys1) =>
      if (x<y) x :: merge(xs1, ys)
      else y :: merge(xs, ys1)
  }

merge(List(1,3,5), List(2, 4, 6))
