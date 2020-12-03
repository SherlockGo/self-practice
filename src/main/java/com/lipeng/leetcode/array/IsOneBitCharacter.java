package com.lipeng.leetcode.array;

/**
 * @author : lipeng
 * @version : 0v1.
 * @description : 717. 1比特与2比特字符
 * @date : 2020/11/12 22:10
 */
public class IsOneBitCharacter {

    //线性扫描
    public boolean isOneBitCharacter(int[] bits){
        int i = 0;
        while (i < bits.length - 1){
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }


    //贪心算法
    public boolean isOneBitCharacter2(int[] bits){
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0){
            i--;
        }
        return (bits.length - i) % 2 == 0;
    }

}
