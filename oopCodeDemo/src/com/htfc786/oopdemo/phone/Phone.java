package com.htfc786.oopdemo.phone;

public class Phone {

    // 成员变量
    String brand;   // 手机品牌
    double price;   // 价格

    // 成员方法
    public void call() {
        System.out.println(this.brand + "手机正在打电话");
    }

    public void play() {
        System.out.println(this.brand + "手机正在玩游戏");
    }

}
