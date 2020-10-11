package com.lipeng.algorithm.leetcode.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program: self-practice
 * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * @author: LiPeng
 * @create: 2020-10-11 09:20
 **/
public class IsValid {

    public static boolean isValid(String s){
        int length = s.length();
        if ((length & 1) == 1){
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < length; i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }
                stack.pop(); //出栈
            } else {
                stack.push(c); //入栈
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()}}";
        boolean valid = isValid(s);
        System.out.println(valid);
    }


}
