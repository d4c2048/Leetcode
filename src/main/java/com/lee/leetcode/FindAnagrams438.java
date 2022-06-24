package com.lee.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams438 {

    /*public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        int[] array = new int[26];
        for (char c : p.toCharArray()) {
            array[c - 'a']++;
        }
        for (int start = 0; start <= s.length() - p.length(); ) {
            if (array[s.charAt(start) - 'a'] > 0) {
                int[] temp = new int[26];
                boolean flag = true;
                System.arraycopy(array, 0, temp, 0, 26);
                for (int end = start, count = 0; count < p.length(); count++) {
                    if (temp[s.charAt(end) - 'a'] == 0) {
                        if (array[s.charAt(end) - 'a'] == 0) {
                            start = end;
                        }
                        flag = false;
                        break;
                    }
                    else {
                        temp[s.charAt(end++) - 'a']--;
                    }
                }
                if (flag) {
                    ans.add(start);
                }
            }
            start++;
        }
        return ans;
    }*/

    public static void main(String[] args) {
        System.out.println(new FindAnagrams438().findAnagrams("cbaebabacd", "abc"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }

        return ans;
    }

}
