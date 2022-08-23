package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/24 15:47
 */
public class EvalRPN150 {

    public static void main(String[] args) {
        System.out.println(new EvalRPN150().evalRPN(new String[]{"4","13","5","/","+"}));
    }

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        int res = 0;
        String[] stack = new String[tokens.length];
        int index = 0;
        for (String s : tokens) {
            switch (s) {
                case "+" -> {
                    int a = Integer.parseInt(stack[--index]);
                    int b = Integer.parseInt(stack[--index]);
                    res = b + a;
                    stack[index++] = String.valueOf(res);
                }
                case "-" -> {
                    int a = Integer.parseInt(stack[--index]);
                    int b = Integer.parseInt(stack[--index]);
                    res = b - a;
                    stack[index++] = String.valueOf(res);
                }
                case "*" -> {
                    int a = Integer.parseInt(stack[--index]);
                    int b = Integer.parseInt(stack[--index]);
                    res = b * a;
                    stack[index++] = String.valueOf(res);
                }
                case "/" -> {
                    int a = Integer.parseInt(stack[--index]);
                    int b = Integer.parseInt(stack[--index]);
                    res = b / a;
                    stack[index++] = String.valueOf(res);
                }
                default -> {
                    stack[index++] = s;
                }
            }
        }
        return res;
    }

}
