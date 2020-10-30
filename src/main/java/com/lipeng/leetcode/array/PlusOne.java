package com.lipeng.algorithm.leetcode.array;

/**
 * @program: self-practice
 * @description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * @author: LiPeng
 * @create: 2020-09-29 23:36
 **/
public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {

    }

}
