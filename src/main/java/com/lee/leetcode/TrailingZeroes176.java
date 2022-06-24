package com.lee.leetcode;

public class TrailingZeroes176 {

    public static void main(String[] args) {
        System.out.println(new TrailingZeroes176().trailingZeroes(200));
    }

    public int trailingZeroes(int n) {
        int ans = 0;
        Five[] five = Five.values();
        for(int i = 5; i > 0; i--) {
            Five f = null;
            for(Five ff : five) {
                if(ff.i == i) {
                    f = ff;
                    break;
                }
            }
            int j = (int) Math.pow(5, i);
            if(Math.pow(5, i) <= n) {
                n -= j;
                ans += f.zeroes;
                i++;
            }
        }
        return ans;
    }

    enum Five {

        FIVE_ONE(1, 1),
        FIVE_TWO(2, 6),
        FIVE_THREE(3, 31),
        FIVE_FORE(4, 156),
        FIVE_FIVE(5, 781);

        public final int i;
        public final int zeroes;

        Five(int i, int zeroes) {
            this.i = i;
            this.zeroes = zeroes;
        }

    }

}
