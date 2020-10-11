package com.lipeng.algorithm.leetcode.string;

/**
 * @program: self-practice
 * @description:
 * @author: LiPeng
 * @create: 2020-09-18 20:35
 **/
public class AddStrings {

    public static String addStrings(String num1, String num2){
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            sb.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "415615642156516";
        String num2 = "45456543632152454";
        System.out.println(addStrings(num1, num2));
    }

}
