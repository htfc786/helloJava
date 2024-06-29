package com.htfc786.stringDemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        int numCount = 0;
        int bigCount = 0;
        int smallCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                numCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            }
        }
        System.out.println("数字：" + numCount);
        System.out.println("大写：" + bigCount);
        System.out.println("小写：" + smallCount);
    }
}
