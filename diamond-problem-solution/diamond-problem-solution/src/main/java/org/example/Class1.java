package org.example;

public class Class1 implements Interface2,Interface1{

    @Override
    public void fly() {
        Interface2.super.fly();
        System.out.println("class 1");
    }
}

//şimdi iki interface de de aynı imza mevcut peki hangisini implement edecek
//şu durumda interface2'de bulunan imzayı implemet edecek ilk o var.

// default edersek hangi interfaceyi implement edersekonun ismini belirtmemiz yeterlidir.
