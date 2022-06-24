package com.lee.leetcode;

public class ConvertToBase7504 {

    public static void main(String[] args) {
        System.out.println(new ConvertToBase7504().convertToBase7(-8));
    }

    public String convertToBase7(int num) {
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(true) {
            sb.insert(0, n % 7);
            n /= 7;
            if(n == 0) {
                if (num < 0) {
                    sb.insert(0, '-');
                }
                return sb.toString();
            }
            if(n < 7) {
                sb.insert(0, n);
                if (num < 0) {
                    sb.insert(0, '-');
                }
                return Integer.parseInt(sb.toString()) + "";
            }
        }
    }

}
