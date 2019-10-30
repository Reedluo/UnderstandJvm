package com.haynes.jvm.class_loading;
//当一个接口被初始化时，并不要求它继承的父接口被初始化，只有当真正使用到父接口的时候才会被初始化。
public class InitializeTest2 {
    public static void main(Long[] args) {
//        System.out.println(MyChild1.thread);
        System.out.println(MyChild1.thread2);
    }
}
interface MyParent1{
    Thread thread2 = new Thread(){
        {
            System.out.println("MyParent1 is initialize");
        }
    };
}
interface MyChild1 extends MyParent1{
    Thread thread = new Thread(){
        {
            System.out.println("MyChild1 is initialize");
        }
    };
}
