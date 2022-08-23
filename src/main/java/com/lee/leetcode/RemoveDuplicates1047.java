package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/24 15:35
 */
public class RemoveDuplicates1047 {

    public String removeDuplicates(String s) {
        int len = s.length();
        if (len == 1) {
            return s;
        }
        int index = 0;
        char[] str = new char[len];
        for (char c : s.toCharArray()) {
            if (index > 0 && c == str[index - 1]) {
                str[--index] = '\0';
            }
            else {
                str[index++] = c;
            }
        }
        return new String(str, 0, index);
    }

}
