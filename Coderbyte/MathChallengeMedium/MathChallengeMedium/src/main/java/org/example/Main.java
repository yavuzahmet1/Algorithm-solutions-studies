package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int MathChallenge(int num) {
        List<Integer> list = permutation("", String.valueOf(num), new ArrayList<Integer>());
        for (int x : list) {
            if (isPrime(x)) return 1;
        }
        return 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> permutation(String first, String last, List<Integer> list) {
        if (last.length() <= 1) {
            list.add(Integer.valueOf(first + last));
        } else {
            for (int i = 0; i < last.length(); i++) {
                String str = last.substring(0, i) + last.substring(i + 1);
                permutation(first + last.charAt(i), str, list);
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {

        System.out.println(MathChallenge(910));

    }
}