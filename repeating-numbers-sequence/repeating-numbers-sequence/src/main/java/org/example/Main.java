package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static Integer[] removeDuplicates(Integer[] arr){
        if(arr.length == 0){
            return new Integer[0];
        }

        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        int lastItem = arr[0];

        for(int i=1; i<arr.length; i++){
            if(lastItem != arr[i]){
                lastItem = arr[i];
                result.add(lastItem);
            }
        }
        return result.toArray(Integer[]::new);
    }

    public static void main(String args[])
    {
        Integer[] input = new Integer[] {1,2,2,2,3,4,4,5,6,7,7,8,9,9,9,9};

        System.out.println("\nInput Array");
        System.out.println(Arrays.toString(input));

        Integer[] output = removeDuplicates(input);
        System.out.println("\nOutput Array");
        System.out.println(Arrays.toString(output));
    }
}