package com.lee.leetcode.utils;

/**
 * @author HASEE
 */
public class RandomUtils {

    public static void main(String[] args) {
        int page = (int) (Math.random() * 26 + 1);
        int row = (int) (Math.random() * 100 + 1);
        System.out.println("页数："+ page +"\n行数：" + row);
        System.out.println("号数：" + ((page - 1) * 100 + row));
    }

}
