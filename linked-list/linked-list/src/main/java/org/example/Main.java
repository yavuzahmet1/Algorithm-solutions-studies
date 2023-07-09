package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] x={1,5,78,5,59};
        LinkedList<Integer>y=new LinkedList<>();
        System.out.println(Arrays.toString(x));
        System.out.println(y.peek());
        for (Integer k : x) {
            //y.push(k);
            y.add(k);
            //

        }

        System.out.println(y.peek());
        System.out.println(y.getLast());
        System.out.println(Arrays.asList(y));
        System.out.println(y);

        Hashtable<String,Integer>price=new Hashtable<>();

        price.put("Elma",5);
        price.put("Armut",10);
        System.out.println(price.get("Elma"));
        System.out.println(price.containsKey("Elmaa"));

        String m="Ahmet is teacher to";
        String n="Ali is very tall";

        m=m.replace(" ","");
        System.out.println(m);
        n=n.replace(" ","");
        System.out.println(n);

        m=m.toLowerCase();
        n=n.toLowerCase();
        System.out.println(m +" "+n);

    }
}