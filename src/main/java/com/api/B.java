package com.api;

public class B {
    public static void main(String[] args){
        B b1 = new B();
        int val  = b1.test();
        System.out.println(val);
    }
    public int test(){
        System.out.println("Hello");
        return 100;
    }
}
