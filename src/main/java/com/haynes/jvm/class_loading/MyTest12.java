package com.haynes.jvm.class_loading;

//通过反射来主动引用
public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = loader.loadClass("com.haynes.jvm.class_loading.CL");
        System.out.println(aClass);
        System.out.println("========");
        aClass = Class.forName("com.haynes.jvm.class_loading.CL");
        System.out.println(aClass);
    }
}
class CL{
    static {
        System.out.println("Class Cl");
    }
}
