package com.lee.leetcode;

public class RemoveElement27 {

    public static void main(String[] args) {
        System.out.println(new RemoveElement27().removeElement(new int[] {3, 2, 2, 3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left <= right) {
            while (left <= right && nums[left] != val) {
                left++;
            }
            while (left <= right && nums[right] == val) {
                right--;
                count++;
            }
            if (left <= right) {
                nums[left++] = nums[right];
                nums[right--] = val;
                count++;
            }
        }
        return nums.length - count;
    }

}
