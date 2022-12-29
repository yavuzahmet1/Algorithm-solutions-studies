package org.palindrome;

public class Main {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        if (x == 0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        while (x > reverse) {
            var lastDigit = x % 10;
            x /= 10;
            reverse = reverse * 10 + lastDigit;
        }
        if (x == reverse || x == reverse / 10) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1010));
    }
}