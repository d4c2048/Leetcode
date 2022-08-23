package com.lee.leetcode;

import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations17 {

    private static final Map<Character, char[]> NUM = new HashMap<>(){
        @Serial
        private static final long serialVersionUID = 1L;
        {
            put('2', new char[]{'a', 'b', 'c'});
            put('3', new char[]{'d', 'e', 'f'});
            put('4', new char[]{'g', 'h', 'i'});
            put('5', new char[]{'j', 'k', 'l'});
            put('6', new char[]{'m', 'n', 'o'});
            put('7', new char[]{'p', 'q', 'r', 's'});
            put('8', new char[]{'t', 'u', 'v'});
            put('9', new char[]{'w', 'x', 'y', 'z'});
        }
    };
    private List<String> res = null;
    private int len;
    private String str;

    public static void main(String[] args) {
        System.out.println(new LetterCombinations17().letterCombinations("2345"));
    }

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits) || null == digits) {
            return new ArrayList<>();
        } else {
            res = new ArrayList<>();
            len = digits.length();
            str = digits;
            back(0, new StringBuilder(), res);
            return res;
        }
    }

    private void back(int index, StringBuilder sb, List<String> res) {
        char[] chars = NUM.get(str.charAt(index));
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            if (len == sb.length()) {
                res.add(sb.toString());
            }
            if (index < len - 1) {
                back(index + 1, sb, res);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
