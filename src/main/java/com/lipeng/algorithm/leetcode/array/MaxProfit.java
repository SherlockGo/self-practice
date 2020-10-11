package com.lipeng.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: self-practice
 * @description: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *               如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来
 *               计算你所能获取的最大利润。
 * @author: LiPeng
 * @create: 2020-10-09 20:54
 **/
public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int res = 0;
        int len = prices.length;
        for(int i = 0; i < len - 1; i++){
            for (int j = i+1; j < len; j++){
                int diff = prices[j] - prices[i];
                if (diff > res){
                    res = diff;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
