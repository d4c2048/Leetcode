package com.lee.leetcode;

import java.util.LinkedList;

/**
 * @author Lee
 * @since 2022/6/24 14:12
 */
class MyQueue232 {

    private LinkedList<Integer> input;
    private LinkedList<Integer> output;

    public MyQueue232() {
        input = new LinkedList<>();
        output = new LinkedList<>();
    }

    public void push(int x) {
        while (!output.isEmpty()) {
            input.add(output.pollLast());
        }
        input.add(x);
        while (!input.isEmpty()) {
            output.add(input.pollLast());
        }
    }

    public int pop() {
        Integer res = output.pollLast();
        return  res != null ? res : Integer.MIN_VALUE;
    }

    public int peek() {
        Integer res = output.peekLast();
        return  res != null ? res : Integer.MIN_VALUE;
    }

    public boolean empty() {
        return output.isEmpty();
    }
}
