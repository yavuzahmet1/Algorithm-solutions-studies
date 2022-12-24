package org.example;

public class Main {
    public static void main(String[] args) {
        Lambda l=(x,y)->x*y;
        System.out.println("result : "+l.run(5,7));
    }
}