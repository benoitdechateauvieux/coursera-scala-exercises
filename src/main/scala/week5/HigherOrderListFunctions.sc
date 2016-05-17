def squareListPM(xs : List[Int]): List[Int] =
  xs match {
    case Nil => Nil
    case y :: ys => y*y :: squareListPM(ys)
  }

squareListPM(List(1,2,3,4,5))

def squareListMap(xs : List[Int]): List[Int] =
  xs map (x => x*x)

squareListMap(List(1,2,3,4,5))


def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    //(xs takeWhile (y => y==x)) :: pack((xs dropWhile (y => y==x)))
    val (first, rest) = xs span (y => x==y)
    first :: pack(rest)
}

pack(List("a", "a", "a", "b", "c", "c", "a"))

def encode[T](xs: List[T]):List[(T, Int)] = {
  pack(xs) map (x => (x.head, x.length))
}

encode(List("a", "a", "a", "b", "c", "c", "a"))

def concat[T](xs: List[T], ys: List[T]):List[T] =
  (xs foldRight ys)( _ :: _ )

concat(List("a", "b", "c"), List("d", "e", "f"))
