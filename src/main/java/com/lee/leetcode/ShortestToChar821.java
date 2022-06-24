package com.lee.leetcode;

import java.util.Arrays;

public class ShortestToChar821 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShortestToChar821().shortestToChar("loveleetcode", 'e')));
    }

    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        char[] charSet = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ans[i] = getMinDistance(charSet, c, i);
        }
        return ans;
    }

    public int getMinDistance(char[] charSet, char target, int index) {
        int left,right;
        left = right = index;
        while(right <= charSet.length - 1 && left >= 0 && charSet[left] != target && charSet[right] != target) {
            if(left > 0) {
                left--;
            }
            if(right < charSet.length - 1) {
                right++;
            }
        }
        return charSet[left] == target ? Math.abs(index - left) : Math.abs(index - right);
    }

}
