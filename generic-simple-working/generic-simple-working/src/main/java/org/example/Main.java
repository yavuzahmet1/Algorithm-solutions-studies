package org.example;

public class Main {
    public static void main(String[] args) {
        Printer<String> printer=new Printer<>("Ahmet");
        printer.print();
        Printer<Integer>integerPrinter=new Printer<>(101);
        integerPrinter.print();
    }
}