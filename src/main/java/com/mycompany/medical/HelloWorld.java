package com.mycompany.medical;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;

class HelloWorld {
    public static void main(String[] args) {
        HashMap<String, Parent> huh = new HashMap<String,Parent>();
        huh.put("BloodTest", new Child());
        
        huh.get("BloodTest").test();
    }
}


class Parent {
    void test() {
        System.out.println("Im parent");
    }
}

class Child extends Parent {
    void test() {
        System.out.println("Im child");
    }
}