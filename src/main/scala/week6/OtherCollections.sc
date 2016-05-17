def isPrime(n: Int): Boolean =
  if (n==1) true
  else (2 until n) forall (d => n%d != 0)

isPrime(1)
isPrime(2)
isPrime(8)
isPrime(9)
isPrime(12)
isPrime(13)
isPrime(999)

val n=7
val xss = (1 until n) map (i =>
            (1 until i) map (j => (i,j)))

xss reduceRight (_ ++ _)

xss.flatten

(1 until n) flatMap (i =>
  (1 until i) map (j => (i,j))) filter (pair =>
    isPrime(pair._1 + pair._2))

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime( i+j )
} yield ( i , j )

def scalarProductBch(xs: List[Double], ys: List[Double]) : Double =
  (for (i <- xs.indices) yield xs(i) * ys(i)) reduceRight(_ + _)

def scalarProduct(xs: List[Double], ys: List[Double]) : Double =
  (for ( (x,y) <- xs zip ys) yield x*y).sum

val list1:List[Double] = List(1.0, 2.0, 3.0)
val list2:List[Double] = List(2.0, 2.0, 2.0)

scalarProductBch(list1, list2)
scalarProduct(list1, list2)
