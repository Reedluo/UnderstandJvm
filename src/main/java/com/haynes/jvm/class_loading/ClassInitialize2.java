package com.haynes.jvm.class_loading;

import java.util.UUID;

//静态常量在运行时赋值的情况下，main方法里调用这个常量时也会初始化NormalClass类。
public class ClassInitialize2 {
    public static void main(Long[] args) {
        System.out.println(NormalClass.s);
    }
}

class NormalClass{
    public static final String s = UUID.randomUUID().toString();
    static {
        System.out.println("NormalClass is init");
    }
}
