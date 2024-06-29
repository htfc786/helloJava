package com.htfc786.loopdemo;

import java.util.Random;
import java.util.Scanner;

public class Caishuzi {
    public static void main(String[] args) {
        /*猜数字小游戏
        需求:程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少? */

        // 随机数
        Random r = new Random();
        int num = r.nextInt(100);// 0~99

        // 输入
        Scanner sc = new Scanner(System.in);

        int inp, count = 0;
        do {
            if (count >= 3){
                System.out.println(num);
                break;
            }

            System.out.println("请猜数字：");
            inp = sc.nextInt();

            if (inp > num) {
                System.out.println("大了！");
            } else if (inp < num) {
                System.out.println("小了！");
            }

            count++;
        } while (inp != num);
        System.out.println("猜中了！");
    }
}
