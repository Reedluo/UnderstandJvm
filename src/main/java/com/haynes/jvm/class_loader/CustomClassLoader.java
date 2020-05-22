package com.haynes.jvm.class_loader;

import java.io.*;

public class CustomClassLoader extends ClassLoader {
    private String classLoaderName;
    private final String fileExtension = ".class";
    private String path;

    public CustomClassLoader(String classLoaderName) {
        //ClassLoader构造方法创建了一个默认的systemClassLoader
        super();
        this.classLoaderName = classLoaderName;
    }

    public CustomClassLoader(ClassLoader parent, String classLoaderName) {
        //将类加载器parent作为该类(CustomClassLoader)加载器的父类加载器
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString() {
        return "[" + this.classLoaderName + "]";
    }

    @Override
    protected Class<?> findClass(String className) {
        byte[] bytes = this.loadClassData(className);
        return this.defineClass(className, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        System.out.println("findClass invoked: " + name);
        System.out.println("classLoader name: "+ classLoaderName);
        try {
            name = name.replace(".", "/");
            is = new FileInputStream(new File(this.path + name + fileExtension));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
                data = baos.toByteArray();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return data;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static void main(String[] args) throws Exception {
        CustomClassLoader myClassLoader1 = new CustomClassLoader("loader1");
        myClassLoader1.setPath("/Users/haynes/Desktop/");
        Class<?> aClass = myClassLoader1.loadClass("com.haynes.jvm.class_loading.MyTest13");
        Object instance = aClass.newInstance();
        System.out.println(instance);
        System.out.println(instance.getClass().getClassLoader());
        System.out.println();


        Thread.sleep(20000000);
        CustomClassLoader myClassLoader2 = new CustomClassLoader("loader2");
        myClassLoader2.setPath("/Users/haynes/Desktop/");
        Class<?> aClass1 = myClassLoader2.loadClass("com.haynes.jvm.class_loading.MyTest13");
        Object instance1 = aClass1.newInstance();
        System.out.println(instance1);
        System.out.println(instance1.getClass().getClassLoader());
    }

}
