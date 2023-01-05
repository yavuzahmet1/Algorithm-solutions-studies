package org.example;

import java.util.Stack;

public class Main {
    public static String isBalanced(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                myStack.push(s.charAt(i));
            } else {
                if (myStack.empty()) {
                    return "NO";
                } else {
                    Character topStack = myStack.pop();
                    if (s.charAt(i) == ')' && topStack != '(') {
                        return "NO";
                    } else if (s.charAt(i) == '}' && topStack != '{') {
                        return "NO";
                    } else if (s.charAt(i) == ']' && topStack != '[') {
                        return "NO";
                    }

                }
            }

        }
        if (myStack.empty()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[[)]}"));
        System.out.println(isBalanced("{[()]}"));
    }
}
