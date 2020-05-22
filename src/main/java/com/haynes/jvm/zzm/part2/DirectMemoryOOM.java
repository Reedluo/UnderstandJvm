package com.haynes.jvm.zzm.part2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * @auther yh
 */
public class DirectMemoryOOM {
    private static final int _4MB = 4096 * 4096;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        while (true) {
            unsafe.allocateMemory(_4MB);
        }
    }
}
