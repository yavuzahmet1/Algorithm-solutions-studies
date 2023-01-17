package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] x=new int[]{1,2,3,4};
        int[] x1=new int[]{1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(x));
        System.out.println(containsDuplicate(x1));


    }
}