package com.lee.leetcode;

public class MaximumWealth1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account : accounts) {
            int sum = 0;
            for(int bank : account) {
                sum += bank;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

}
