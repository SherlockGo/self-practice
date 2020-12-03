package com.lipeng.leetcode.string;

/**
 * @author : lipeng
 * @version : 0v1.
 * @description : 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B
 *               相等的结果，就返回 true ；否则返回 false 。
 * @date : 2020/11/19 20:33
 */
public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {  //两个字符串相同
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i)
                count[A.charAt(i) - 'a']++;  //字符出现次数

            for (int c: count)
                if (c > 1) return true;
            return false;
        } else {  //两个字符串不相同
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }

    }

}
