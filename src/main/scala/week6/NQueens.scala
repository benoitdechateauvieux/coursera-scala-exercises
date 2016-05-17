package week6

/**
  * Created by benoit on 5/16/16.
  */
object NQueens {

  def isSafe(col: Int, queens: List[Int]): Boolean = {
    println("isSafe "+col+" for "+queens)
    val diagonals = for (
      (x, i) <- queens.zipWithIndex
    ) yield List(x-(i+1), x+(i+1))

    println("diagonals = "+ diagonals)
    println("diagonals ++ queens = "+ (diagonals.flatten ++ queens))
    ! ((diagonals.flatten ++ queens) contains col)
  }
}
