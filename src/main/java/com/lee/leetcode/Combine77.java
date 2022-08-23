package com.lee.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lee
 * @since 2022/8/5 17:54
 */
public class Combine77 {

    private final List<List<Integer>> ANS = new ArrayList<>();

    private final List<Integer> T = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new Combine77().combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        if (n < k) {
            return new ArrayList<>(0);
        }
        saveList(1, n, k);
        return ANS;
    }

    private void saveList(int start, int n, int k) {
        if (start > n) {
            return;
        }
        T.add(start);
        if (T.size() == k) {
            ANS.add(new ArrayList<>(T));
        } else {
            saveList(start + 1, n, k);
        }
        T.remove(T.size() - 1);
        saveList(start + 1, n, k);
    }

}
