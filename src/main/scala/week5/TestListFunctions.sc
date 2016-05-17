def last[T](xs : List[T]): T = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case x :: y => last(y)
}

def init[T](xs : List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
//  case x :: y => List(x) ++ init(y)
  case x :: y => x :: init(y)
}

last(List(1,2,3,4,5))
init(List(1,2,3,4,5))

def removeAt[T](xs: List[T], n: Int): List[T] = n match {
  case 0 => xs.tail
  case x => List(xs.head) ++ removeAt(xs.tail, x-1)
}

def removeAt2[T](xs: List[T], n: Int): List[T] =
  (xs take n) ::: (xs drop n+1)

removeAt(List(1,2,3,4,5), 3)
removeAt2(List(1,2,3,4,5), 3)