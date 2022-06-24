package com.lee.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lee
 */
public class FourSumCount454 {

    public static void main(String[] args) {
        System.out.println(new FourSumCount454().fourSumCount(new int[]{-1, -1}, new int[] {-1, 1}, new int[] {-1, 1}, new int[] {1, -1}));
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                map.put(num1 + num2, map.getOrDefault(num1 + num2, 0) + 1);
            }
        }
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                if (map.containsKey(-(num3 + num4))) {
                    ans += map.get(-(num3 + num4));
                }
            }
        }
        return ans;
    }

}
