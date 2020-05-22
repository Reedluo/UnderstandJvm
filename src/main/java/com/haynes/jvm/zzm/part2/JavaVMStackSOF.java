package com.haynes.jvm.zzm.part2;

public class JavaVMStackSOF {
    private int statckLength = 1;

    public void stackLeak() {
        statckLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable throwable) {
            System.out.println("stack length:" + oom.statckLength);
            throw throwable;
        }

    }
}
