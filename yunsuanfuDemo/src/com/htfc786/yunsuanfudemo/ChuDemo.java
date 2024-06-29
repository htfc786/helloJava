package com.htfc786.yunsuanfudemo;

public class ChuDemo {
    public static void main(String[] args) {
        // 除法
        System.out.println(10 / 2); //5
        System.out.println(10 / 3); //3
        System.out.println(10.0 / 3); //3.3333333333333335
        //  整数参与运算，得到的只能是整数
        //  有小数参与运算，结果可能不精确

        //取模
        System.out.println(10 % 2); //0
        System.out.println(10 % 3); //1

        //取模的应用场景：
        // 1.可以用取模来判断，A是否可以被B整除
        //  A % B 10 % 3
        // 2.可以判断A是否为偶数
        //  A % 2 如果结果为0,那么证明A是一个偶数；如果结果为1，那么证明A是一个奇数
        // 3.斗地主发牌
        //  三个玩家
        //  把每一张牌都定义一个序号
        //  拿着序号%3 如果结果为1，就发给第一个玩家。
        //  如果结果为2，那么就发给第二个玩家
        //  如果结果为0，那么就发给第三个玩家

    }
}
