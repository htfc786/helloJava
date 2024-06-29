package com.htfc786.loopdemo;

import java.util.Scanner;

public class Huiwenshu {
    public static void main(String[] args) {
        /* 回文数
        需求:给你一个整数x。
        如果x是一个回文整数，打印true，否则，返回 false 。
        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数。
        例如，121是回文，而123 不是。*/

        // 数x
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数：");
        int x = sc.nextInt();
//        int x = 123;

        //倒置数字x
        int temp = x;
        int res = 0;//倒置结果

        while (temp > 0){
            // 取出一位
            int step = temp % 10;
            // 舍弃这位
            temp = temp / 10;
            // 添加进入结果数字
            res = res * 10 + step;
        }

        System.out.println("数字："+x);
        System.out.println("倒置数字："+res);
        System.out.println(res == x);
        System.out.println(res == x ? "是回文数" : "不是回文数");

    }
}
