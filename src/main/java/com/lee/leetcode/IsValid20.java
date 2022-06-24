package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/24 14:52
 */
public class IsValid20 {

    /*public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{', '(', '[' -> stack.add(c);
                case '}' ->  {
                    if (stack.peekLast() != null && stack.peekLast() == '{') {
                        stack.removeLast();
                    }
                    else {
                        return false;
                    }
                }
                case ']' ->  {
                    if (stack.peekLast() != null && stack.peekLast() == '[') {
                        stack.removeLast();
                    }
                    else {
                        return false;
                    }
                }
                case ')' ->  {
                    if (stack.peekLast() != null && stack.peekLast() == '(') {
                        stack.removeLast();
                    }
                    else {
                        return false;
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + c);
            }
        }
        return stack.isEmpty();
    }*/

    public static void main(String[] args) {
        System.out.println(new IsValid20().isValid("}"));
    }

    public boolean isValid(String s) {
        int len = s.length();
        char[] stack = new char[len];
        int index = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> stack[index++] = c;
                case ')' -> {
                    if (index > 0 && stack[index - 1] == '(') {
                        stack[--index] = '\0';
                    }
                    else {
                        return false;
                    }
                }
                case ']' -> {
                    if (index > 0 && stack[index - 1] == '[') {
                        stack[--index] = '\0';
                    }
                    else {
                        return false;
                    }
                }
                case '}' -> {
                    if (index > 0 && stack[index - 1] == '{') {
                        stack[--index] = '\0';
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return index == 0;
    }

}
