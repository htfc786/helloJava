package com.htfc786.loopdemo;

public class Feng7Guo {
    public static void main(String[] args) {
        /* 逢7过
        朋友聚会的时候可能会玩一个游戏:逢7过
        游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过:过
        需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据 */

        //1-100的数
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 ||      // 个位为7
                i / 10 % 10 == 7 || // 十位为7
                i % 7 == 0          // 7的倍数
            ){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}
