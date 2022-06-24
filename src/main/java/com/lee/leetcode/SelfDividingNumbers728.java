package com.lee.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {

    public static void main(String[] args) {
        System.out.println(new SelfDividingNumbers728().selfDividingNumbers(47, 85));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            selfDividing(ans, i, (i + "").length());
        }
        return ans;
    }

    public void selfDividing(List<Integer> ans, int num, int length) {
        int t = num;
        while (length > 0) {
            int pow = (int) Math.pow(10, length - 1);
            if(t / pow == 0 || num % (t / pow) != 0) {
                return;
            }
            t %= pow;
            length--;
        }
        ans.add(num);
    }

}
