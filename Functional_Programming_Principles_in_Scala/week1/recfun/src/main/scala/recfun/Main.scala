package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    * 1
    * 1 1
    * 1 2 1
    * 1 3 3 1
    * 1 4 6 4 1
    * 1 5 10 10 5 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1 else if (r == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c + 1, r - 1)
  }

  /**
    * Exercise 2
    *
    * ())()))
    *
    */
  def balance(chars: List[Char]): Boolean = {

    def loop(line: List[Char], open: Int): Boolean = {
      if (line.isEmpty) open == 0
      else if (line.head == '(') loop(line.tail, open + 1)
      else if (line.head == ')' && open > 0) loop(line.tail, open - 1)
      else loop(line.tail, open)
    }

    loop(chars, 0)
  }
    /**
      * Exercise 3
      */
    def countChange(money: Int, coins: List[Int]): Int = ???

}