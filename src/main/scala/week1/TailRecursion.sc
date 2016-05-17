import scala.annotation.tailrec

def factorial(n: Int): Int =
  if (n==0) 1 else n * factorial(n-1)

factorial(5)

def recursiveFactorial(n: Int): Int = {
  @tailrec
  def recursion(value: Int, n: Int): Int =
    if (n == 0) value else recursion(value * n, n - 1)

  recursion(1, n)
}

recursiveFactorial(5)