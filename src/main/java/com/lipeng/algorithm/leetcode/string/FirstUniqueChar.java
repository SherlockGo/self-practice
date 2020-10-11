package com.lipeng.algorithm.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: self-practice
 * @description: 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不
 *               存在，则返回 -1。
 * @author: LiPeng
 * @create: 2020-09-17 23:01
 **/
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < len; i++){
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

}
