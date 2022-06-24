package com.lee.leetcode;

public class TotalFruit904 {

    /*public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>(2);
        int left = 0, right = 0, count = 3, ans = 0;
        while (right < fruits.length) {
            if (!basket.containsKey(fruits[right])) {
                count--;
            }
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while (count <= 0) {
                Integer t = basket.get(fruits[left]) - 1;
                ans = Math.max(ans, right - left);
                if (t.equals(0)) {
                    basket.remove(fruits[left]);
                    count++;
                }
                else {
                    basket.put(fruits[left], t);
                }
                left++;
            }
            right++;
        }
        return Math.max(ans, right - left);
    }*/

    public static void main(String[] args) {
        System.out.println(new TotalFruit904().totalFruit(new int[] {1, 2, 1}));
    }

    public int totalFruit(int[] fruits) {
        int ans = 0, left = 0, right = 0, len = fruits.length, count = 2;
        boolean[] used  = new boolean[len];
        while (right < len) {
            if (used[fruits[right]]) {
                right++;
            }
            else {
                if (count > 0) {
                    count--;
                    used[fruits[right++]] = true;
                }
                else {
                    ans = Math.max(ans, right - left);
                    int pre = right - 1;
                    while (fruits[pre] == fruits[pre - 1]) {
                        pre--;
                    }
                    left = pre;
                    used[fruits[pre - 1]] = false;
                    count++;
                }
            }
        }
        return Math.max(ans, right - left);
    }

}
