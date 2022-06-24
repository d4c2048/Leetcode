package com.lee.leetcode;

import java.util.Arrays;

/**
 * @author Lee
 */
public class CountBits338 {

    /*
    最高有效位
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int heightBit = 0;
        for(int i = 1; i <= n; i++) {
            if((i & (i - 1)) == 0) {
                heightBit = i;
            }
            // +1是加上在位运算是减去的高位1
            ans[i] = ans[i - heightBit] + 1;
        }
        return ans;
    }*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountBits338().countBits(50)));
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            ans[i] = i % 2 == 0 ? ans[i >> 1] : ans[i >> 1] + 1;
        }
        return ans;
    }

}
