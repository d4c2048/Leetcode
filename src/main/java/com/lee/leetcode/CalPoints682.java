package com.lee.leetcode;

/**
 * @author HASEE
 */
public class CalPoints682 {

    /*public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int pointer = -1;
        for (int i = 0; i < ops.length; i++) {
            try {
                list.add(Integer.valueOf(ops[i]));
                pointer++;
            }
            catch (Exception e) {
                if("+".equals(ops[i])) {
                    list.add(list.get(pointer - 1) + list.get(pointer));
                    pointer++;
                }
                else if("C".equals(ops[i])) {
                    list.remove(pointer);
                    pointer--;
                }
                else if("D".equals(ops[i])) {
                    list.add(list.get(pointer) * 2);
                    pointer++;
                }
            }
        }
        Iterator<Integer> it = list.iterator();
        int ans = 0;
        while (it.hasNext()) {
            ans += it.next();
        }
        return ans;
    }*/

    public static void main(String[] args) {
        System.out.println(new CalPoints682().calPoints(new String[]{"5","2","C","D","+"}));
    }

    public int calPoints(String[] ops) {
        int[] ans = new int[ops.length];
        int index = 0;
        for (String op : ops) {
            switch (op.charAt(0)) {
                case 'C' -> {
                    ans[index - 1] = 0;
                    index--;
                }
                case 'D' -> {
                    ans[index] = 2 * ans[index - 1];
                    index++;
                }
                case '+' -> {
                    ans[index] = ans[index - 1] + ans[index - 2];
                    index++;
                }
                default -> {
                    ans[index] = Integer.parseInt(op);
                    index++;
                }
            }
        }
        int res = 0;
        for (int an : ans) {
            res += an;
        }
        return res;
    }

}
