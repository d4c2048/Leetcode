package com.lee.leetcode;

/**
 * @author Lee
 * @since 2022/6/20 22:52
 */
public class ReverseWords151 {

    private static final char SPACE = ' ';

    /*public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() > 0) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }*/

    /*public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        StringJoiner sj = new StringJoiner(" ");
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                length++;
                while (i >= 0 && chars[i] != ' ') {
                    i--;
                    length++;
                }
                sj.add(new String(chars, i + 1, length - 1));
                length = 0;
            }
        }
        return sj.toString();
    }*/

    public static void main(String[] args) {
        System.out.println(new ReverseWords151().reverseWords("the sky is blue"));
    }

    public String reverseWords(String s) {
        char []str = s.toCharArray();
        int len = str.length;
        int index=0;
        int left=0;
        int right=len-1;
        while(str[left] == SPACE){
            left++;
        }
        while(str[right] == SPACE){
            right--;
        }

        for(int i=left;i<=right;i++){
            if(str[i]!=' '||str[i+1]!=' '){
                str[index++]=str[i];
            }
        }
        char []res = new char[index];
        for(int i =0;i<index;i++){
            res[i]=str[i];
        }
        reverse(res,0,index-1);
        left=0;
        right = 0;
        while(right<index){
            if(res[right]==' '){
                reverse(res,left,right-1);
                left = right+1;
            }
            right++;
        }
        reverse(res,left,right-1);

        return String.valueOf(res);
    }

    public void reverse(char[] str, int left ,int right){
        while(left<right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            ++left;
            --right;
        }
    }

}
