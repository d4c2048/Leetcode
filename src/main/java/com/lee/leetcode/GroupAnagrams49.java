package com.lee.leetcode;

import java.util.*;

public class GroupAnagrams49 {

    public static void main(String[] args) {
        System.out.println(new GroupAnagrams49().groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            List<String> strings = ans.getOrDefault(str, new ArrayList<>());
            strings.add(s);
            ans.put(str, strings);
        }
        return new ArrayList<>(ans.values());
    }

}
