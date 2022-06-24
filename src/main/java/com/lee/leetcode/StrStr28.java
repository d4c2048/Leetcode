package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/21 10:54
 */
public class StrStr28 {

    /*public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int index = 1;
                while (i < haystack.length() - 1 && index < needle.length() && needle.charAt(index) == haystack.charAt(++i)) {
                    index++;
                }
                if (index == needle.length()) {
                    return i - index + 1;
                }
                if (i == haystack.length() - 1) {
                    return -1;
                }
                i = i - index;
            }
        }
        return -1;
    }*/

    public static void main(String[] args) {
        StrStr28 strStr28 = new StrStr28();
        System.out.println(strStr28.strStr("mississipi", "issipi"));
    }

    public int strStr(String haystack, String needle) {
        int[] next = getNext(needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == next.length) {
                return i - j + 1;
            }
        }
        return -1;
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
