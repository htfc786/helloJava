package com.htfc786.loopdemo;

import java.util.Scanner;

public class Chu {
    public static void main(String[] args) {
        /*求商和余数
        需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)。
        将两数相除，要求不使用乘法、除法和%运算符。
        得到商和余数。 */

//        int chu = 200;
//        int bei = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("除数：");
        int chu = sc.nextInt();
        System.out.println("被除数：");
        int bei = sc.nextInt();

        int count = 0;
        //不断的的去减，直至减到减不开
        while (chu >= bei){
            // 不断的去减
            chu -= bei;
            // 统计减的次数=>商
            count++;
        }

        System.out.println("商："+count);
        System.out.println("余数："+chu);
    }
}
