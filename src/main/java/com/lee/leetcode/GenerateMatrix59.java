package com.lee.leetcode;

public class GenerateMatrix59 {

    public int[][] generateMatrix(int n) {
        int a = 0;
        int b = n - 1;
        int c = n - 1;
        int d = 0;
        int condition = n;
        int[][] arr = new int[n][n];
        int num = 0;
        int e = 0;
        while (condition > 0) {
            if (a == b && b == c && c == d) {
                arr[a][a] = ++num;
                break;
            }
            for (int i = e; i < n - 1 - e; i++) {
                arr[a++][i] = ++num;
            }
            for (int i = e; i < n - 1 - e; i++) {
                arr[i][b--] = ++num;
            }
            for (int i = n - 1 - e; i > e; i--) {
                arr[c--][i] = ++num;
            }
            for (int i = n - 1 - e; i > e; i--) {
                arr[i][d++] = ++num;
            }
            e++;
            condition -= 2;
        }
        return arr;
    }

}
