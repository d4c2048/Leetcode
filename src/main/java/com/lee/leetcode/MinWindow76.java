package com.lee.leetcode;

/**
 * @author Lee
 */
public class MinWindow76 {

    private int[] tArray;
    private int[] sArray;

    public static void main(String[] args) {
        System.out.println(new MinWindow76().minWindow("cabwefgewcwaefgcf", "cae"));
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        String ans = "";
        int length = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        initMap(t);
        while (right < s.length()) {
            char c = s.charAt(right);
            sArray[c - 'A'] += 1;
            while (check()) {
                if(right + 1 - left < length) {
                    ans = s.substring(left, right + 1);
                    length = ans.length();
                }
                sArray[s.charAt(left++) - 'A']--;
            }
            right++;
        }
        return ans;
    }

    private void initMap(String t) {
        tArray = new int[58];
        sArray = new int[58];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tArray[c - 'A']++;
        }
    }

    private boolean check() {
        for (int i = 0; i < tArray.length; i++) {
            if (tArray[i] != 0) {
                if (sArray[i] < tArray[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
