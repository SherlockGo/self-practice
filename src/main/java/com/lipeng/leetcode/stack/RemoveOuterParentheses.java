package com.lipeng.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * @program: self-practice
 * @description: 1021. 删除最外层的括号
 * @author: LiPeng
 * @create: 2020-10-18 20:12
 **/
public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String S) {
        StringBuffer sb = new StringBuffer("");
        Stack<Character> stack = new Stack<>();

        int len = S.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < len; i++) {
            start = end;
            if (S.charAt(i) == '('){     //左括号入栈
                stack.push(S.charAt(i));
            } else if (S.charAt(i) == ')'){   //右括号出栈
                if (!stack.isEmpty()){   //如果栈不空的话,就让一个左括号出栈
                    stack.pop();
                }
                if (stack.isEmpty()){   //如果栈空了的话，就说明它是一个完整单位，就删除两侧的括号
                    end = i;
                    for (int j = start + 1; j < end; j++){
                        sb.append(S.charAt(j));
                    }
                    end++;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

}
