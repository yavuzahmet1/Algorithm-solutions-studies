package org.divide;

public class Main {
    public static int divide(int dividend, int divisor) {
        int sign = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int counter = 0;
        while ((dividend - divisor) >= 0) {
            counter++;
            dividend = dividend - divisor;
        }
        return sign < 0 ? -counter : counter;
    }

    public static void main(String[] args) {
        System.out.println(divide(19, 4));
        System.out.println(divide(7, -3));
        System.out.println(divide(-10, 3));
        System.out.println(divide(10, 1));
        System.out.println(divide(10, 10));
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println(Integer.MIN_VALUE+1);
    }
}