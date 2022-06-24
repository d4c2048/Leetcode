package com.lee.leetcode;

public class MyPow50 {

    public static void main(String[] args) {
        System.out.println(new MyPow50().myPow(2, -2));
        Math.pow(0, 0);
    }

    public double myPow(double x, int n) {
        if(n == 0 || x == 1) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        if(n == -1) {
            return 1 / x;
        }
        double ans;
        int residue = n % 2;
        double temp = myPow(x, n / 2);
        ans = temp * temp;
        if(residue == 1) {
            ans *= x;
        }
        if(residue == -1) {
            ans /= x;
        }
        return ans;
    }

}
