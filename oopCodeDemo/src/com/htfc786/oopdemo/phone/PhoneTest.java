package com.htfc786.oopdemo.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();

        p1.brand = "华为";
        p1.price = 7999;

        System.out.println(p1.brand);
        System.out.println(p1.price);

        p1.call();
        p1.play();


        Phone p2 = new Phone();

        p2.brand = "小米";
        p2.price = 1999;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.play();


    }
}
