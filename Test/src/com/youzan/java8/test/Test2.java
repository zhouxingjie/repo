package com.youzan.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by xingjie.zhou on 16/8/19.
 */
public class Test2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        List<String> list = Arrays.asList("a","b","c");
        System.out.println(list.stream().collect(Collectors.joining(",")).toString());
    }
}