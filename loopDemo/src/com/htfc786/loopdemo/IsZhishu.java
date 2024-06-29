package com.htfc786.loopdemo;

import java.util.Scanner;

public class IsZhishu {
    public static void main(String[] args) {
        /* 求质数
        需求:键盘录入一个正整数x，判断该整数是否为一个质数。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0){
                System.out.println(num+"不是质数");
                return;
            }
        }
        System.out.println(num+"是质数！");
    }
}
