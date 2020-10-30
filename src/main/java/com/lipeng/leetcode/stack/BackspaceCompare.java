package com.lipeng.algorithm.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @program: self-practice
 * @description: 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
 *               判断二者是否相等，并返回结果。 # 代表退格字符。
 * @author: LiPeng
 * @create: 2020-10-17 22:55
 **/
public class BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        return process(S).equals(process(T));
    }

    public String process(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (c != '#'){
                stack.push(c);
            } else if (!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }


    public static void main(String[] args) {

//        String s = "abcde##f#g#";
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        System.out.println(Arrays.toString(chars));



    }

}
