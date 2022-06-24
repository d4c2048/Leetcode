package com.lee.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect350 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Intersect350().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] num1Count = new int[1000];
        List<Integer> ans = new ArrayList<>();
        for (int num : nums1) {
            num1Count[num - 1]++;
        }
        for (int num : nums2) {
            if (num1Count[num - 1] > 0) {
                num1Count[num - 1]--;
                ans.add(num);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

}
