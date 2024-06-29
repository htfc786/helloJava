package com.htfc786.yunsuanfudemo;

public class QiangzhizhuanhuanDemo {
    //强制转换demo
    public static void main(String[] args) {
        byte b1 = 13;
        int b2 = 12;
        byte result = (byte)(b1 + b2);
        System.out.println(result);

        char a = '杨';
        int a_num = a + 0;
        System.out.println(a_num);

        char b = '！';
        int b_num = b + 0;
        System.out.println(b_num);

        char c = '!';
        int c_num = c + 0;
        System.out.println(c_num);
    }
}
