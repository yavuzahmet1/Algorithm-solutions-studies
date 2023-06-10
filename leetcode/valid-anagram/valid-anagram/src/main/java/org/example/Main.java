package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

    static boolean isAnagram2(String a, String b) {
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] a_chars = a.toCharArray();
        char[] b_chars = b.toCharArray();
        System.out.println(a_chars);
        System.out.println(b_chars);
        Arrays.sort(a_chars);
        Arrays.sort(b_chars);
        System.out.println(a_chars);
        System.out.println(b_chars);
        return Arrays.equals(a_chars,b_chars);



    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagrama";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram2(s, t));


    }
}