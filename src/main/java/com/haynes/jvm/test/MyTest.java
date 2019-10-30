package com.haynes.jvm.test;

public class MyTest {
    public static void main(String[] args) {
        String s = "com.haynes.jvm.class_loading.MyParent";
        int i = s.lastIndexOf('.');
        System.out.println(i);
        System.out.println(s.length());
        String fileName = s.substring(s.lastIndexOf('.') + 1) + ".class";
        System.out.println(fileName);
    }
}
