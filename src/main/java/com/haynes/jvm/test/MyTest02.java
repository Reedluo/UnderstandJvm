package com.haynes.jvm.test;

public class MyTest02 {
    public static void main(String[] args) {
        OrderTest orderTest = new OrderTest();
        if (orderTest.getOms().getRp() != null) {
            System.out.println("1");
        }
        else {
        System.out.println("2");
        }
    }
}
