package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    static boolean containsDuplicateFor(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; i++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean containsDuplicateMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
        }
        return false;
    }
    static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4,5,1,5};
        System.out.println(containsDuplicate(a));
        System.out.println(containsDuplicateFor(a));
        System.out.println(containsDuplicateMap(a));
        System.out.println(containsDuplicateHashSet(a));


    }
}