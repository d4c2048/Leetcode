package com.lee.leetcode;

public class Reverse7 {

    private static final String MAX_VALUE = Integer.MAX_VALUE + "";
    private static final String MIN_VALUE = Integer.MIN_VALUE + "";

    /*public int reverse(int x) {
        StringBuilder sb = new StringBuilder(x + "");
        sb.reverse();
        if(x < 0) {
            sb.delete(sb.length() - 1, sb.length());
            sb.insert(0, '-');
        }
        String reverseNum = sb.toString();
        if(reverseNum.compareTo(MAX_VALUE) > 0 && reverseNum.length() >= MAX_VALUE.length()) {
            return 0;
        }
        else if(x < 0 && reverseNum.compareTo(MIN_VALUE) > 0 && reverseNum.length() >= MIN_VALUE.length()) {
            return 0;
        }
        else {
            return Integer.parseInt(reverseNum);
        }
    }*/

    public static void main(String[] args) {
        System.out.println(new Reverse7().reverse(123456789));
    }

    public int reverse(int x) {
        int xx = x;
        int ans = 0;
        while(xx != 0) {
            int temp = ans;
            temp = temp * 10 + (xx % 10);
            xx /= 10;
            ans = temp / 10 == ans ? temp : 0;
        }
        return ans;
    }

}
