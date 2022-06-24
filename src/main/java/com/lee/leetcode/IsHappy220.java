package com.lee.leetcode;

public class IsHappy220 {

    /*public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>(){{
            add(n);
        }};
        int num = n;
        while (num != 1) {
            num = calculate(num);
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }

    private int calculate(int n) {
        int res = 0;
        while (n > 0) {
            res += (int)Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }*/

    public static void main(String[] args) {
        System.out.println(new IsHappy220().isHappy(2));
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        while (fast != 1) {
            fast = calculate(calculate(fast));
            slow = calculate(slow);
            if (fast == slow) {
                return fast == 1;
            }
        }
        return true;
    }

    private int calculate(int n) {
        int res = 0;
        while (n > 0) {
            res += (int)Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }

}
