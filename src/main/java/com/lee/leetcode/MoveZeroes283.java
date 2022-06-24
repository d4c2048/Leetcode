package com.lee.leetcode;

import java.util.Arrays;

/**
 * @author Lee
 * @since 2022/6/22 11:37
 */
public class MoveZeroes283 {

    public static void main(String[] args) {
        int[] nums = {1, 0};
        new MoveZeroes283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length - 1) {
            while (nums[left] != 0 && left < nums.length - 1) {
                left++;
            }
            right = left + 1;
            while (right < nums.length - 1 && nums[right] == 0) {
                right++;
            }
            if (nums[right] != 0) {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
            }
        }
    }

}
