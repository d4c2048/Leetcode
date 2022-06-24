package com.lee.leetcode;

public class ClimbStairs70 {

    public static void main(String[] args) {
        System.out.println(new ClimbStairs70().climbStairs(3));
    }

    public int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n - 1];
    }

}
