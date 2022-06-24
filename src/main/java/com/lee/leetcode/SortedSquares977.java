package com.lee.leetcode;

import java.util.Arrays;

public class SortedSquares977 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortedSquares977().sortedSquares(new int[]{-5, -1, 0, 1, 4, 8})));
    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = ans.length - 1;
        int pointer = ans.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                ans[pointer--] = (int) Math.pow(nums[right--], 2);
            }
            else if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[pointer--] = (int) Math.pow(nums[left++], 2);
            }
            else {
                if (right == left) {
                    ans[pointer--] = (int) Math.pow(nums[left++], 2);
                    continue;
                }
                ans[pointer--] = (int) Math.pow(nums[left++], 2);
                ans[pointer--] = (int) Math.pow(nums[right--], 2);
            }
        }
        return ans;
    }

}
