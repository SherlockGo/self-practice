package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description: 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个
 *               机器人在完成移动后是否在 (0, 0) 处结束。
 * @author: LiPeng
 * @create: 2020-09-28 23:15
 **/
public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        if ("".equals(moves) || moves.isEmpty()){
            return false;
        }
        char[] chars = moves.toCharArray();
        int r = 0, l = 0, u = 0, d = 0;
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (c == 'R'){
                r++;
            }
            if (c == 'L'){
                l++;
            }
            if (c == 'U'){
                u++;
            }
            if (c == 'D'){
                d++;
            }
        }
        if (r == l && u == d){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
