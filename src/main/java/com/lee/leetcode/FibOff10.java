package com.lee.leetcode;

public class FibOff10 {

    public static void main(String[] args) {
        System.out.println(new FibOff10().fib(45));
    }

    public int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int p = 0, q = 1,count = 2, r = 1;
        while(count < n) {
            p = q;
            q = r;
            r = (p + q) % 1000000007;
            count++;
        }
        return r;
    }

}
