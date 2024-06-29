package com.htfc786.exercise;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入男生时髦程度：");
        int boy = sc.nextInt();
        System.out.println("请输入女生时髦程度：");
        int girl = sc.nextInt();

        System.out.println(boy > girl);
    }
}
