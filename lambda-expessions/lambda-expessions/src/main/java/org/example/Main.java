package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lambda l = (x, y) -> x * y;
        System.out.println("result : " + l.run(5, 7));
        System.out.println("****");
        List<Integer> intSeq = Arrays.asList(1, 2, 3, 4);
        intSeq.forEach(x -> System.out.println(x));
        System.out.println("****");
        intSeq.forEach(y -> {
            int z = y + 2;
            System.out.println(z);
        });
        System.out.println("****");
        intSeq.forEach(System.out::println);
    }
}