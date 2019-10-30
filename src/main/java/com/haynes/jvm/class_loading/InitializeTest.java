package com.haynes.jvm.class_loading;

//初始化一个类时，并不会初始化它实现的接口，只有当真正使用父接口的时候才会初始化
public class InitializeTest {
    public static void main(Long[] args) {
//        System.out.println(MyChild.a);
        System.out.println(MyChild.thread);
    }
}
interface MyParent{
    Thread thread = new Thread(){
        {
            System.out.println("MyParent is initialize");
        }
    };
}
class MyChild implements MyParent{
    public static int a = 8;
}
