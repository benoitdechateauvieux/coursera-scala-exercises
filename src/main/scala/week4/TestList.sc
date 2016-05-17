

def isort(xs: scala.List[Int]): scala.List[Int] = xs match {
  case scala.List() => scala.List()
  case y :: ys => insert(y, isort(ys))
}

def insert(x: Int, xs: scala.List[Int]): scala.List[Int] = xs match {
  case scala.List() => scala.List(x)
  case y :: ys => {
    if (x<=y) x :: xs
    else y :: insert(x, ys)
  }
}

scala.List(7, 3, 9, 2)
isort(scala.List(7, 3, 9, 2))