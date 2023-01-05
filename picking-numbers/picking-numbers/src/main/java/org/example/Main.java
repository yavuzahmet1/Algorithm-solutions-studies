package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 3, 1, 3));
        int mostLenghtSubArray = 0;
        for (int i = 0; i < a.size(); i++) {
            int counter = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) == a.get(j) || a.get(i) == (a.get(j) - 1)) counter++;
            }

            if (counter > mostLenghtSubArray) mostLenghtSubArray = counter;
        }
        System.out.println("Most Lenght Sub Array : " + mostLenghtSubArray);

    }
}