package com.lee.leetcode;

public class MaxArea11 {

    public static void main(String[] args) {
        System.out.println(new MaxArea11().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = (right - left) * Math.min(height[left], height[right]);
        int tempHeight;
        while(left < right) {
            if(height[left] > height[right]) {
                tempHeight = height[right];
                right--;
                if(height[right] > tempHeight) {
                    max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
                }
            }
            else {
                tempHeight = height[left];
                left++;
                if(height[left] > tempHeight) {
                    max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
                }
            }
        }
        return max;
    }

}
