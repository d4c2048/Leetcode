package com.lee.leetcode;

import java.util.Arrays;

public class MissingRolls2028 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MissingRolls2028().missingRolls(new int[]{1, 5, 6}, 3, 4)));
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int rollsSum = 0;
        int length = rolls.length;
        int sum = (n + length) * mean;
        for (int roll : rolls) {
            rollsSum += roll;
        }
        int i1 = (sum - rollsSum) % n;
        if(sum < rollsSum || sum > rollsSum + 6 * n || (sum == rollsSum + 6 * n && i1 != 0) || sum < rollsSum + n) {
            return new int[]{};
        }
        else {
            int[] ans = new int[n];
            int r = i1;
            int t = (sum - rollsSum) / n;
            for(int i = 0; i < n; i++) {
                ans[i] = t;
            }
            int i = 0;
            while(r > 0) {
                ans[i] += 1;
                i++;
                r--;
            }
            return ans;
        }
    }

}
