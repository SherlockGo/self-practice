package com.lipeng.algorithm.leetcode.stack;

/**
 * @program: self-practice
 * @description: 棒球比赛，见LeetCode第682题
 * @author: LiPeng
 * @create: 2020-10-15 22:35
 **/
public class CalPoints {

    public int calPoints(String[] ops) {
        int[] res = new int[1001];
        int sum = 0;
        int j = 0;

        for (int i = 0; i < ops.length; i++){
            switch (ops[i]){
                case "+":
                    res[j] = res[j -1] + res[j - 2];
                    j++;
                    break;
                case "C":
                    j--;
                    break;
                case "D":
                    res[j] = res[j - 1] * 2;
                    j++;
                    break;
                default:
                    res[j] = Integer.valueOf(ops[i]);
                    j++;
                    break;
            }
        }
        for (int i = 0; i < j; i++){
            sum += res[i];
        }
        return sum;
    }

}
