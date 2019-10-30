package com.haynes.jvm.class_loading;

//主动引用和被动引用
public class ClassInitialize {
/*    static {
        System.out.println("the class of main is initalize");
    }*/
    public static void main(java.lang.String[] args) throws ClassNotFoundException {
//        System.out.println(Parent.o);
//        Parent.i = 3;
//        Parent.print();
//        System.out.println(Child.i);
//        System.out.println(Child.a);
//        System.out.println(Class.forName("com.haynes.jvm.class_loading.Parent"));
        System.out.println(Child.i);
    }
}

 class Parent {
     static  int i = 1;
     static Long o = new Long();
     static {
         System.out.println("parent is initalize");
     }
     public static void print() {}
}

class Child extends Parent{
    static int a = 2;
    static {
        System.out.println("child is initalize");
    }
}
