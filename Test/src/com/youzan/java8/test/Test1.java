package com.youzan.java8.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xingjie.zhou on 16/8/19.
 */
public class Test1 {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach(e -> System.out.print(e));
        Arrays.asList("a", "b", "d").forEach((String e) -> {
            System.out.print(e);
        });
        System.out.println();
        List<String> list = Arrays.asList("d", "f", "b");
//        list.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        Collections.sort(list, (e1, e2) -> e1.compareTo(e2));
        list.forEach(e -> System.out.println(e));


        List<String> names = new ArrayList<>();
        names.add("TaoBao");
        names.add("ZhiFuBao");
        List<String> lowercaseNames = names.stream().map(name ->
                name.toLowerCase()
        ).collect(Collectors.toList());
        lowercaseNames.forEach(e -> System.out.println(e));
    }
}
