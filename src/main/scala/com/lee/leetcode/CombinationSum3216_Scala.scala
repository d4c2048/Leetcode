package com.lee.leetcode

object CombinationSum3216_Scala {

    import scala.collection.mutable.ListBuffer

    def combinationSum3(k: Int, n: Int): List[List[Int]] = {
        if (k >= n) {
            List()
        } else {
            val res = ListBuffer.empty[List[Int]]
            back(1, k, n, ListBuffer.empty[Int], res)
            res.toList
        }
    }

    def back(num: Int, k: Int, n:Int, list: ListBuffer[Int], res: ListBuffer[List[Int]]): Unit = {
        for (i <- num to 9) {
            list += i
            if (k == list.size) {
                if (n == list.sum) {
                    res += list.toList
                }
            } else {
                back(i + 1, k, n, list, res)
            }
            list -= i
        }
    }

    def main(args: Array[String]): Unit = {
        println(combinationSum3(3, 7))
    }

}
