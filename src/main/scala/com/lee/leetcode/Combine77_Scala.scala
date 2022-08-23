package com.lee.leetcode

object Combine77_Scala {

  def main(args: Array[String]): Unit = {
    println(combine(4, 2))
    println(combine(4, 3))
  }

  def combine(n: Int, k: Int): List[List[Int]] = {
    import scala.collection.mutable.ListBuffer
    if (n == 1) {
      List(List(1))
    } else {
      val res = ListBuffer.empty[List[Int]]
      def dfs(num: Int, list: ListBuffer[Int]): Unit = {
        if (k - 1 == list.size) {
          for (i <- num to n) {
            list += i
            res += list.toList
            list -= i
          }
        } else {
          for (i <- num to n - k + 1 + list.size) {
            list += i
            dfs(i + 1, list)
            list -= i
          }
        }
      }
      dfs(1, ListBuffer.empty[Int])
      res.toList
    }
  }

}
