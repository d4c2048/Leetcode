package com.lee.leetcode;

public class HasAlternatingBits693 {

    public static void main(String[] args) {
        System.out.println(new HasAlternatingBits693().hasAlternatingBits(11));
    }

    public boolean hasAlternatingBits(int n) {
        String binaryNum = Integer.toBinaryString(n);
        for (int i = 0; i < binaryNum.length() - 1; i++) {
            if(binaryNum.charAt(i) == binaryNum.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
