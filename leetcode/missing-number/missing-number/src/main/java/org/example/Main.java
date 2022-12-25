package org.example;

import java.util.HashSet;

public class Main {
    public static int missingNumber(int[] numbers){
        int sum=0;
        int n=numbers.length;
        for (int number:numbers){
            sum+=number;
        }
        return (n*(n+1))/2-sum;
    }
    public static int missingNumberHashSet(int[] numbers){
        int sum=0;
        int n=numbers.length;
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<n;i++){
            hashSet.add(numbers[i]);
        }
        for (int i=0;i<n;i++){
            if (!hashSet.contains(i)){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        var numbers=new int[]{0,2,3,1,5,6};
        System.out.println(missingNumber(numbers));
        System.out.println(missingNumberHashSet(numbers));
    }
}