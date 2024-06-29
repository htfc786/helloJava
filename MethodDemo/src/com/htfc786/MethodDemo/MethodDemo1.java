package com.htfc786.MethodDemo;

public class MethodDemo1 {
    // 方法重载 函数重载
    public static void main(String[] args) {
        byte n1 = 2;
        byte n2 = 2;
        System.out.println(compare(n1,n2));

        short n3 = 114;
        short n4 = 514;
        System.out.println(compare(n3,n4));

        int n5 = 114514;
        int n6 = 114514;
        System.out.println(compare(n5,n6));

        long n7 = 1000000000000L;
        long n8 = 1000000000000L;
        System.out.println(compare(n7,n8));


        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));

    }

    public static boolean compare(byte n1, byte n2){
        System.out.println("byte");
        return n1 == n2;
    }

    public static boolean compare(short n1, short n2){
        System.out.println("short");
        return n1 == n2;
    }

    public static boolean compare(int n1, int n2){
        System.out.println("int");
        return n1 == n2;
    }

    public static boolean compare(long n1, long n2){
        System.out.println("long");
        return n1 == n2;
    }
}
