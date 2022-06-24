package com.lee.leetcode;

public class MinSubArrayLen209 {

    public static void main(String[] args) {
        System.out.println(new MinSubArrayLen209().minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (right <= nums.length) {
            if (sum >= target) {
                ans = Math.min(ans, right - left);
                sum -= nums[left++];
            }
            else {
                if(right < nums.length) {
                    sum += nums[right];
                }
                right++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

}
