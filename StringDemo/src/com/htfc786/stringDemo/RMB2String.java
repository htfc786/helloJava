package com.htfc786.stringDemo;

import java.util.Scanner;

public class RMB2String {
    public static void main(String[] args) {
        // 2135
        // 贰壹叁伍
        // 零零零贰壹叁伍
        // 零佰零拾零万贰仟壹佰叁拾伍元

        Scanner sc = new Scanner(System.in);
        int money;
        int num = 0;
        while (true) {
            System.out.println("请输入金额：");
            num = sc.nextInt();
            if (num <= 9999999 && num >= 0) {
                money = num;
                break;
            } else {
                System.out.println("输入的金额不合法！");
            }
        }

        StringBuffer sb = new StringBuffer();
        int temp = money;
        while (temp > 0) {
            // 取出一位，先取出各位，然后十位，百位，千位，万位。。。
            int step = temp % 10;
            // 舍弃这位
            temp = temp / 10;
            // 转换中文
            String zh = getCapitalNumber(step);
            // 加入
            sb.append(zh);
        }

        if (sb.length() < 7) {
            int len = sb.length();
            for (int i = 0; i < (7 - len); i++) {
                sb.append("零");
            }
        }
        sb.reverse();
//        String moneyStr = sb.toString();

        StringBuffer sb2 = new StringBuffer();

        String[] weiArr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < weiArr.length; i++) {
            sb2.append(sb.charAt(i));
            sb2.append(weiArr[i]);
        }

        String moneyStr = sb2.toString();

        System.out.println(moneyStr);

    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
