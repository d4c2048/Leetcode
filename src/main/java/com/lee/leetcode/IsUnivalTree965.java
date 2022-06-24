package com.lee.leetcode;

import com.lee.leetcode.utils.TreeNode;

public class IsUnivalTree965 {

    public int ans = 1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(2, new TreeNode(5), new TreeNode(2)), new TreeNode(2));
        System.out.println(new IsUnivalTree965().isUnivalTree(root));
    }

    public boolean isUnivalTree(TreeNode root) {
        inTra(root, root.val);
        return ans == 1;
    }

    public void inTra(TreeNode root, int val) {
        if(root.left != null) {
            inTra(root.left, val);
        }
        if(root.val != val) {
            ans = 0;
            return;
        }
        if(root.right != null) {
            inTra(root.right, val);
        }
    }

}
