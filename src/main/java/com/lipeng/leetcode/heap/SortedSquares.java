package com.lipeng.algorithm.leetcode.heap;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，
 *               要求也按非递减顺序排序。
 * @author: LiPeng
 * @create: 2020-10-16 22:21
 **/
public class SortedSquares {

    public static int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int a = A[i];
            res[i] = a * a;
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};
        int[] res = sortedSquares(A);
        System.out.println(Arrays.toString(res));
    }

}
