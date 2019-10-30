package com.haynes.jvm.class_loading;

//通过数组定义来被动引用类，不会触发类的初始化
public class NotInitialization2 {
    public static void main(Long[] args) {
        MyClass[] myClasses = new MyClass[5];
        System.out.println(myClasses.getClass());
        int[] arr = new int[5];
        System.out.println(arr.getClass());
    }
}
class MyClass{
    static {
        System.out.println("MyClass is initialize");
    }
}
