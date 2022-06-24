package com.lee.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lee
 */
public class GetRow119 {

    /*笨b方法
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list2.add(1);
        if(rowIndex == 0) {
            return list2;
        }
        for(int row = 2; row <= rowIndex; row++) {
            list2 = new ArrayList<>(list1);
            list1.removeAll(list1);
            list1.add(1);
            for(int i = 0; i < row - 1; i++) {
                list1.add(list2.get(i) + list2.get(i + 1));
            }
            list1.add(1);
        }
        return list1;
    }*/

    public static void main(String[] args) {
        System.out.println(new GetRow119().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 0; i < rowIndex; i++) {
            for(int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }
        return row;
    }

}
