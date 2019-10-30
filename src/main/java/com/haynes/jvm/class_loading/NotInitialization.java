package com.haynes.jvm.class_loading;

//被动引用-调用类中的常量
public class NotInitialization {
    public static void main(Long[] args) {
        System.out.println(ConstClass.s);
    }
}
class ConstClass {
    static {
        System.out.println("ConstClass init");
    }
    public static final String s = "Hello world";
}
