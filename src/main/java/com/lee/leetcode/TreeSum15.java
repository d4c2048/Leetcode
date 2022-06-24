package com.lee.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TreeSum15 {

    public static void main(String[] args) {
        System.out.println(new TreeSum15().threeSum(new int[] {
            -1, 0, 1, 2, -1, -4
        }));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }
        Map<Integer, HashSet<List<Integer>>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int finalJ = j;
                int finalI = i;
                HashSet<List<Integer>> set = map.getOrDefault(nums[i] + nums[j], new HashSet<>());
                set.add(new ArrayList<>(){{add(finalI);add(finalJ);}});
                map.put(nums[i] + nums[j], set);
            }
        }
        for(int k = 2; k < nums.length; k++) {
            Set<List<Integer>> set = map.getOrDefault(-nums[k], null);
            int finalK = k;
            if (set != null) {
                List<List<Integer>> collect = set.stream().filter(list -> list.contains(finalK)).peek(list -> list.add(finalK)).collect(Collectors.toList());
                if (collect.size() > 0) {
                    ans.addAll(collect.stream().map(list -> list.stream().map(num -> num = nums[num]).collect(Collectors.toList())).collect(Collectors.toList()));
                }
            }
        }
        return ans;
    }

}
