package com.htfc786.yunsuanfudemo;

public class YunsuanfuDemo01 {
    public static void main(String[] args) {
        // +
        System.out.println(2 + 3);  //5
        // -
        System.out.println(8 - 4);  //4
        // *
        System.out.println(4 * 8); //32

        //运算有小数参与
        System.out.println(3.1 + 2.1);  //5.2
        System.out.println(3.1 - 2.1);  //1.0
        System.out.println(3.1 * 2.1);  //6.510000000000001

        System.out.println(3.1 + 2.01); //5.109999999999999
        System.out.println(3.1 - 2.01); //1.0900000000000003
        System.out.println(3.1 * 2.01); //6.231
        // ！！！在代码中，有小数参与的的运算，结果可能是不精确的

        System.out.println(3.0 + 2);    //5.0
        System.out.println(3.0 - 2);    //1.0
        System.out.println(3.0 * 2);    //6.0
        // 有小数参与的运算结果也是小数


    }
}
