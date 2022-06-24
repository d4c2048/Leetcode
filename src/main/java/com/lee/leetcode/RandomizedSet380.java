package com.lee.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet380 {

    public List<Integer> list;
    public int length;
    public Map<Integer, Integer> map;

    public RandomizedSet380() {
        list = new ArrayList<>();
        map = new HashMap<>();
        length = 0;
    }

    public boolean insert(int val) {
        if(map.get(val) == null) {
            list.add(val);
            map.put(val, length++);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean remove(int val) {
        if(map.get(val) == null) {
            return false;
        }
        else {
            int index = map.get(val);
            int last = list.get(--length);
            list.set(index, last);
            list.remove(length);
            map.remove(val);
            map.put(last, index);
            return true;
        }
    }

    public int getRandom() {
        return list.get((int) (Math.random() * length));
    }

}
