package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[3];

        ArrayList<Integer> arrayList = new ArrayList<Integer>();//değişkenin memory adresini tutuyor, belli tipteki objeleri tutuyor
        arrayList.add(5);
        arrayList.add(3);
        System.out.println(arrayList.stream().filter(p -> p < 5).collect(Collectors.toList()));

        LinkedList<String> linkedList = new LinkedList<String>();
        //silmek için elemana gitmek gerekiyor.
        linkedList.add("Ahmet");
        linkedList.add("Veli");
        linkedList.add("Salih");
        linkedList.add("Ali");
        linkedList.add("Mert");
        System.out.println(linkedList.peek());

        System.out.println(linkedList);


        if (linkedList.contains("Veli")){
            System.out.println("Veli var");
        }else {
            System.out.println("Veli yok");
        }
        System.out.println("-------HackerRank List-------");
        //[prev  5   next]-----> [prev  3   next]-----> [prev  9   next] linkedListemizde bulunan elemanları tekrar terten yazdırmamızı isiyor
        LinkedList<String> current=linkedList;
        LinkedList<String> temp;
        System.out.println(current);
        while (current!=null){
            current.peek();

        }
    }
}