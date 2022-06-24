package com.lee.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author HASEE
 */
public class MostCommonWord819 {

    public static void main(String[] args) {
        System.out.println(new MostCommonWord819().mostCommonWord("a, a, a, a, b,b,b,c, c", new String[] {"a"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().replaceAll(",", " ").replaceAll("\\.",
                " ").replace("?", " ").replace("!", " ").replace(";",
                " ").replaceAll("'", " ").split(" ");
        List<String> bannedList = Arrays.asList(banned);
        Map<String, Integer> timesMap = new HashMap<>(16);
        for (String word : words) {
            if(!bannedList.contains(word) && !word.isBlank()) {
                timesMap.put(word, timesMap.getOrDefault(word, 0) + 1);
            }
        }
        int max = 0;
        String res = null;
        for(Map.Entry<String, Integer> entry : timesMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

}
