package com.htfc786.loopdemo;

import java.util.Scanner;

public class Pingfanggen2 {
    public static void main(String[] args) {
        // https://www.bilibili.com/video/BV17F411T7Ao?t=357.1&p=51
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

        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小子的，那么继续往后判断
        //如果相等，那么当前数字就是平方根
        //如果大于的，那么前一个数字就是平方跟的整数部分

        for (int i = 1; i <= num; i++) {
            int temp = i * i;
            if (temp == num){
                System.out.println(i+"就是"+num+"的平方根");
                break;
            } else if (temp > num){
                System.out.println((i-1)+"是"+num+"平方跟的整数部分");
                break;
            }
        }
    }
}
