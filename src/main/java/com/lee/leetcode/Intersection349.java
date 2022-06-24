package com.lee.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection349 {

    /*public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                ans.add(j);
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Intersection349().intersection(new int[]{100, 200, 200, 100}, new int[]{200, 200})));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            if (ans[i] == 0) {
                ans[i]++;
            }
        }
        for (int j : nums2) {
            if (ans[j] == 1) {
                ans[j]++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 2) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
