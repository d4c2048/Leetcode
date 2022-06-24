package com.lee.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permute46 {

    private List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new Permute46().permute(new int[]{1}));
    }

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            ans.add(list);
            return ans;
        }
        for(int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            backTrack(list, nums);
        }
        return ans;
    }

    public void backTrack(List<Integer> list, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
                if(list.size() == nums.length) {
                    ans.add(new ArrayList<>(list));
                    list.remove(list.size() - 1);
                    return;
                }
                backTrack(list, nums);
                list.remove(list.size() - 1);
            }
        }
    }

}
