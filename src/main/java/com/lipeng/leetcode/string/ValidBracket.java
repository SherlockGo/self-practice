package com.lipeng.algorithm.leetcode.string;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program: self-practice
 * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * @author: LiPeng
 * @create: 2020-08-31 22:31
 **/
public class ValidBracket {

    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 == 1){
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < length; i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();    //出栈
            } else {
                stack.push(ch);   //入栈
            }
        }
        return stack.isEmpty();
    }

}
