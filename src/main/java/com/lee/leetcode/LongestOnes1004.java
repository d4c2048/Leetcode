package com.lee.leetcode;

public class LongestOnes1004 {

    public static void main(String[] args) {
        System.out.println(new LongestOnes1004().longestOnes(new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1}, 2));
    }

    public int longestOnes(int[] A, int K) {
        int l = 0, r = 0;
        while (r < A.length) {
            if (A[r++] == 0) {
                K--;
            }
            if (K < 0 && A[l++] == 0) {
                K++;
            }
        }
        return r - l;
    }

}
