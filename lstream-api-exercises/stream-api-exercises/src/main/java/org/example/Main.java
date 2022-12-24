package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        int sum = list.stream()
                .map(x -> x * x)
                .reduce((x, y) -> x + y)
                .get();
        System.out.println(sum);
        Arrays.stream(new int[]{2,4,5,6,7,8,9})
                .filter(a->a%2==0)
                .map(b->b*b)
                .average()
                .ifPresent(System.out::println);




    }
}