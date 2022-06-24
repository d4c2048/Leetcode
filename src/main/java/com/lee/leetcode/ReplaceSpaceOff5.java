package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/20 22:45
 */
public class ReplaceSpaceOff5 {

    /*public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }*/

    public String replaceSpace(String s) {
        char[] chars = new char[s.length() * 3];
        int size = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            }
            else {
                chars[size++] = c;
            }
        }
        return new String(chars, 0, size);
    }

}
