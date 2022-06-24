package com.lee.leetcode;

import com.lee.leetcode.utils.TreeNode;

import java.util.*;

public class FindMode501 {

    public Map<Integer, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5)))));
        FindMode501 t = new FindMode501();
        System.out.println(Arrays.toString(t.findMode(root)));
        System.out.println(t.hashMap);
    }

    public int[] findMode(TreeNode root) {
        inTra(root);
        List<Integer> tmp = new ArrayList<>();
        tmp.add(-100001);
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int times = entry.getValue();
            if(times > hashMap.getOrDefault(tmp.get(0), -100001)) {
                tmp.clear();
                tmp.add(entry.getKey());
            }
            else if (times == hashMap.get(tmp.get(0))) {
                tmp.add(entry.getKey());
            }
        }
        int[] ans = new int[tmp.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = tmp.get(i);
        }
        return ans;
    }

    public void inTra(TreeNode root) {
        if(root.left != null) {
            inTra(root.left);
        }
        hashMap.put(root.val, hashMap.getOrDefault(root.val, 0) + 1);
        if (root.right != null) {
            inTra(root.right);
        }
    }

}
