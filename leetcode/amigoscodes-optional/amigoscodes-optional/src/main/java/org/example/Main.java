package org.example;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        System.out.println("********");

        Optional<String> emp = Optional.of("hello!!");
        System.out.println(emp.isEmpty());
        System.out.println(emp.isPresent());
        String orElse = emp.orElse("world");
        System.out.println(orElse);

        System.out.println("********-");

        Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());
        String orElseNull = hello.orElse("world");
        System.out.println(orElseNull);

    }
}