package recfun
import scala.collection.mutable.Stack
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
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0)
        1
      else if (c == r)
        1
      else
        pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def inner(chars: List[Char], open: Int): Boolean ={
       if(chars.isEmpty)
         open == 0
       else if(chars.head=='(')
         inner(chars.tail, open+1)
       else if(chars.head==')')
         open>0&&inner(chars.tail, open-1)
       else
         inner(chars.tail, open)
      }
      inner(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty) {
        0
      } else {
        countChange(money - coins.head, coins.tail)
      }
    }
  }
