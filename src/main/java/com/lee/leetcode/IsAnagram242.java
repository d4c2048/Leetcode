package com.lee.leetcode;

public class IsAnagram242 {

    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            Integer value = entry.getValue();
            Character key = entry.getKey();
            if (!tMap.getOrDefault(key, 0).equals(value)) {
                return false;
            }
        }
        return true;
    }*/

    public static void main(String[] args) {
        System.out.println(new IsAnagram242().isAnagram("asddsa", "dsaasd"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }

}
