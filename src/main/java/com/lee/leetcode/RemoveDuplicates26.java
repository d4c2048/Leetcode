package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/22 11:14
 */
public class RemoveDuplicates26 {

    /*public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int res = 1;
        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            }
            else {
                nums[++left] = nums[right++];
                res++;
            }
        }
        return res;
    }*/

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates26().removeDuplicates(new int[] {1, 2, 3}));
    }

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
