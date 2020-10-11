package com.lipeng.algorithm.leetcode.array;

import java.util.ArrayList;

/**
 * @program: self-practice
 * @description: 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易
 *               （多次买卖一支股票）。
 * @author: LiPeng
 * @create: 2020-10-09 21:28
 **/
public class MaxProfit02 {

    public static int maxProfit(int[] prices) {
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < prices.length - 1; i++){
            int diff = prices[i + 1] - prices[i];
            if (diff < 0) {
                diff = 0;
            }
            list.add(diff);
        }
        if (list == null || list.isEmpty()){
            return 0;
        }
        for (Integer i : list){
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }

}
