package com.lee.leetcode;

public class LengthOfLastWord58 {

    public int lengthOfLastWord(String s) {
        int ans = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(Character.isLetter(s.charAt(i))) {
                ans++;
            }
            else if(ans != 0) {
                break;
            }
        }
        return ans;
    }

}
