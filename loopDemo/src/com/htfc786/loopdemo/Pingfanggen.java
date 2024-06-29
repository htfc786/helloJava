package com.htfc786.loopdemo;

import java.util.Scanner;

public class Pingfanggen {
    public static void main(String[] args) {
        /* 平方根
        需求:促盘录入一个大于等于2的整数x，计算并返回 x的 平方根.
        结果只保留整数部分，小数部分将被舍去。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();

        if (!(num>=2)){
            System.out.println("输入的数字不合法！！！");
            return;
        }

        int result = 0;
        do {
            result++;
        } while ((result * result) <= num);

        System.out.println(result - 1);

    }
}
