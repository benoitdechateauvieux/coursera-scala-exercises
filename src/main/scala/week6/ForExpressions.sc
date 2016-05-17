val liste = 1 to 10

def f(x:Int): Int = x+1
def f2(x:Int): Iterable[Int] = 1 to x

//Map
for (x <- liste) yield f(x)

//FlatMap
for (x <- liste) yield f2(x)
for (x <- liste; y<-f2(x)) yield y



//Translation
case class Book(title:String, authors:List[String])
val books = List(
  Book(title="Livre 1", authors=List("Benoit")),
  Book(title="Livre 2", authors=List("Bird")),
  Book(title="Livre 3", authors=List("Bird"))
)

//original
for (b <- books; a <- b.authors if a startsWith "Bird")
  yield b.title

//1st step
val step1 = books.flatMap(b =>
  for (a <- b.authors if a startsWith "Bird") yield b.title)

//2nd step
val step2 = books.flatMap(b =>
  for (a <- b.authors.withFilter( x => x startsWith "Bird")) yield b.title)

//3nd step
val step3 = books.flatMap(b =>
  b.authors.withFilter( x => x startsWith "Bird") map(a => b.title))



//Maps
val romanNums:Map[Int, Char] = Map(1->'I', 5->'V')
romanNums(1)
romanNums get 6

val romTotal = romanNums withDefaultValue '-'
romTotal(6)
