package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/22 10:49
 */
public class RepeatedSubstringPattern459 {

    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern459().repeatedSubstringPattern("abac"));
    }

    public boolean repeatedSubstringPattern(String s) {
        int[] next = getNext(s);
        return s.length() % (s.length() - next[s.length() - 1]) == 0 && next[s.length() - 1] != 0;
    }

    private int[] getNext(String s) {
        int[] next = new int[s.length()];
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(j) != s.charAt(i)) {
                j = next[j - 1];
            }
            if (s.charAt(j) == s.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

}
