package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(2, 2, 4, 3, 1, 1, 2, 2));
        int d = 4;
        int m = 2;
        int result = 0;
        int sum;
        for (int i = 0; i < s.size() - m + 1; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if (sum == d) result++;
        }
        System.out.println("result  : " + result);
    }
}