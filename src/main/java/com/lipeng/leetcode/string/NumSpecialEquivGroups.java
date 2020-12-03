package com.lipeng.leetcode.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : lipeng
 * @version : 0v1.
 * @description : 893. 特殊等价字符串组
 * @date : 2020/12/2 21:43
 */
public class NumSpecialEquivGroups {

    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String str : A){
            //偶数位的字符
            StringBuilder sb0 = new StringBuilder();
            for (int i = 0; i < str.length(); i+=2){
                sb0.append(str.charAt(i));
            }
            char[] c0 = sb0.toString().toCharArray();
            Arrays.sort(c0);
            //奇数位的字符
            StringBuilder sb1 = new StringBuilder();
            for (int i = 1; i < str.length(); i+=2){
                sb1.append(str.charAt(i));
            }
            char[] c1 = sb1.toString().toCharArray();
            Arrays.sort(c1);
            //最后把c0和c1转换成字符串，并且拼接，放入HashSet中
            //互为特殊等价字符串的字符串经过上面的处理后，得到的结果是相同的，因此利用HashSet进行去重，只留下一种
            set.add(String.valueOf(c0) +String.valueOf(c1));
        }
        return set.size();
    }

}
