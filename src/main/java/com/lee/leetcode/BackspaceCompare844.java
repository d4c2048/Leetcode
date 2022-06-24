package com.lee.leetcode;

import java.util.Arrays;

/**
 * @author Lee
 * @since 2022/6/23 13:31
 */
public class BackspaceCompare844 {

    /*public boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }

    private String backSpace(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.charAt(0) == '#') {
            sb.delete(0, 1);
        }
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == '#') {
                sb.delete(i - 1, i + 1);
                i -= 2;
            }
            while (sb.length() > 0 && sb.charAt(0) == '#') {
                sb.delete(0, 1);
            }
        }
        return sb.toString();
    }*/

    public static void main(String[] args) {
        System.out.println(new BackspaceCompare844().backspaceCompare("a#c#", "c##d#"));
    }

    public boolean backspaceCompare(String s, String t) {
        return Arrays.equals(getNewChars(s), getNewChars(t));
    }

    private char[] getNewChars(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int slow = 0;
        int fast = 0;
        while (fast < chars.length) {
            if (chars[fast] != '#') {
                chars[slow++] = chars[fast++];
            }
            else {
                len--;
                if (slow == 0) {
                    chars[slow] = '\0';
                }
                else {
                    chars[--slow] = '\0';
                    len--;
                }
                fast++;
            }
        }
        return Arrays.copyOf(chars, len);
    }

}
