package com.lee.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermuteUnique47 {

    private int length;

    public static void main(String[] args) {
        System.out.println(new PermuteUnique47().permuteUnique(new int[]{1, 1, 2}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] index = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            index[i] = -1;
        }
        length = 0;
        backTack(res, new ArrayList<>(), index, nums);
        return res;
    }

    public void backTack(List<List<Integer>> res, List<Integer> list, int[] index, int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(!isContains(index, i)) {
                list.add(nums[i]);
                index[length] = i;
                length++;
                if(length == nums.length) {
                    if(!res.contains(list)) {
                        res.add(new ArrayList<>(list));
                    }
                    length--;
                    index[length] = -1;
                    list.remove(length);
                    return;
                }
                backTack(res, list, index, nums);
                length--;
                index[length] = -1;
                list.remove(length);
            }
        }
    }

    public boolean isContains(int[] indexes, int index) {
        for (int i : indexes) {
            if(i == index) {
                return true;
            }
        }
        return false;
    }

}
