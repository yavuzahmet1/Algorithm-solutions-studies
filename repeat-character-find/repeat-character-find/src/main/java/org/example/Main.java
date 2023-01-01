package org.example;

import java.util.HashMap;

public class Main {
    public static String repeatCharacterFind(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String character = s.substring(i, i + 1);
            if (!hashMap.containsKey(character)) {
                hashMap.put(character, 1);
            } else {
                return character;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(repeatCharacterFind("ABCDECA"));

    }
}