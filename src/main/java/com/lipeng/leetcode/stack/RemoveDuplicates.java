package com.lipeng.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * @program: self-practice
 * @description: 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * @author: LiPeng
 * @create: 2020-10-18 21:08
 **/
public class RemoveDuplicates {

    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty() || S.charAt(i) != stack.peek()){
                stack.push(S.charAt(i));
            } else if (S.charAt(i) == stack.peek()){
                stack.pop();
            }
        }

        for (Character c : stack){
            sb.append(c);
        }

        return sb.toString();
    }


    public static void main(String[] args){
        String s = "abbac";
        System.out.println(removeDuplicates(s));

//        Stack<Character> stack = new Stack<>();
//        stack.push('a');
//        stack.push('b');
//        stack.push('c');
//        stack.push('d');
//        System.out.println(stack.toString());

    }

}
