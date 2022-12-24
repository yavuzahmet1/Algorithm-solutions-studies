package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        int sum = list.stream()
                .map(x -> x * x)
                .reduce((x, y) -> x + y)
                .get();
        System.out.println(sum);


    }
}