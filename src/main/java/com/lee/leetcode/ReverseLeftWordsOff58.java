package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/21 10:37
 */
public class ReverseLeftWordsOff58 {

    /*public String reverseLeftWords(String s, int n) {
        int len = s.length();
        char[] res = new char[len];
        for (int i = 0; i < n; i++) {
            res[len - n] = s.charAt(i);
        }
        for (int i = n; i < len; i++) {
            res[i - n] = s.charAt(i);
        }
        return new String(res);
    }*/

    /*public String reverseLeftWords(String s, int n) {
        return s.substring(0, n) + s.substring(n);
    }*/

    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        reverseString(sb, 0, n - 1);
        reverseString(sb, n, sb.length() - 1);
        reverseString(sb, 0, sb.length() - 1);
        return sb.toString();
    }

    private void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

}
