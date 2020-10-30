package com.lipeng.algorithm.leetcode.string;

import org.junit.Test;

/**
 * @program: self-practice
 * @description: 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * @author: LiPeng
 * @create: 2020-09-05 22:51
 **/
public class CountAndSay {

    public String countAndSay(int n){
        if (n == 1){
            return "1";
        }
        StringBuffer sb = new StringBuffer();
        String str = countAndSay(n - 1);
        int length = str.length();
        int start = 0;
        for (int i = 1; i < length + 1; i++) {
            if (i == length){
                sb.append(i - start).append(str.charAt(start));
            } else if (str.charAt(i) != str.charAt(start)){
                sb.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return sb.toString();
    }

    @Test
    public void test(){
        String s = countAndSay(6);
        System.out.println(s);
    }

}
