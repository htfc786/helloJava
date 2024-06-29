package com.htfc786.stringDemo;

import java.util.Random;
import java.util.Scanner;

public class RandomStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
//        String str = sc.next();
        String str = "杨乐童太强了！";


        System.out.println(randomStr(str));
    }

    public static String randomStr(String str) {
        char[] charArr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < charArr.length; i++) {
            int nextIdx = r.nextInt(charArr.length);
            // 随机替换
            char temp = charArr[i];
            charArr[i] = charArr[nextIdx];
            charArr[nextIdx] = temp;
        }
        return new String(charArr);
    }
}
