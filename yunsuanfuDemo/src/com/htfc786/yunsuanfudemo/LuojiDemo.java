package com.htfc786.yunsuanfudemo;

public class LuojiDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a++ < 5 && b++ < 5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a++ > 5 || b++ > 5);
        System.out.println(a);
        System.out.println(b);
    }
}
