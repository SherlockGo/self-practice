package com.lipeng.javase.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @program: self-practice
 * @description:
 * @author: LiPeng
 * @create: 2020-09-20 00:38
 **/
public class Demo02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
        System.out.println("----------------------------------------");

        Random random = new Random();
        random.ints().limit(10).forEach(System.out :: println);
        System.out.println("----------------------------------------");

        List<Integer> numbers = Arrays.asList(3, 2, 5, 8, 6, 4);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        System.out.println("----------------------------------------");

        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        System.out.println("----------------------------------------");

        random.ints().limit(10).sorted().forEach(System.out :: println);
        System.out.println("----------------------------------------");




    }
}
