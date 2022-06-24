package com.lee.leetcode;

public class CanConstruct383 {

    public static void main(String[] args) {
        System.out.println();
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] ans = new int[26];
        for (char c : magazine.toCharArray()) {
            ans[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            ans[c - 'a']--;
            if (ans[c-'a'] == -1) {
                return false;
            }
        }
        return true;
    }

}
