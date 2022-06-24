package com.lee.leetcode;

/**
 * @author Lee
 */
public class Search704 {

    private int target;

    public static void main(String[] args) {
        System.out.println(new Search704().search(new int[] {-1, 0, 3, 5, 9, 12}, 0));
    }

    public int search(int[] nums, int target) {
        this.target = target;
        return half(nums, 0, nums.length - 1);
    }

    private int half(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                return half(nums, mid + 1, right);
            }
            if (target < nums[mid]) {
                return half(nums, left, mid - 1);
            }
        }
        return -1;
    }

}
