package com.lee.leetcode;

/**
 * @author Lee
 */
public class ReverseStr541 {

    private static int k;
    private boolean flag = false;

    public static void main(String[] args) {
        System.out.println(new ReverseStr541().reverseStr("abcdefg", 3));
    }

    public String reverseStr(String s, int k) {
        if (s.length() <= k) {
            return new StringBuilder(s).reverse().toString();
        }
        ReverseStr541.k = k;
        return new String(reverse(s.toCharArray(), 0, 2 * k - 1));
    }

    public char[] reverse(char[] chars, int start, int end) {
        int i = start;
        int j = start + k - 1;
        if (end >= chars.length - 1) {
            end = chars.length - 1;
            flag = true;
        }
        if (j > end) {
            j = end;
        }
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        if (flag) {
            return chars;
        }
        return reverse(chars, start + 2 * k, end + 2 * k);
    }

}
