package com.htfc786.oopdemo.friend;

public class FriendTest {
    public static void main(String[] args) {
        // friend1
        Friend lt = new Friend();
        lt.setName("杨乐童");
        lt.setChinese(115);
        lt.setPhysics(80);

        System.out.println(lt.getName());	//杨乐童
        System.out.println(lt.getChinese());	//115
        System.out.println(lt.getPhysics());	//80

        // friend2
        Friend zs = new Friend("姜博轩",110,90);

        System.out.println(zs.getName());	//姜博轩
        System.out.println(zs.getChinese());	//110
        System.out.println(zs.getPhysics());	//90

        lt.chineseExam();
        zs.chineseExam();
        zs.eat();
        lt.eat();
        zs.pysicsExam();
        lt.pysicsExam();
        lt.study();
        zs.study();
        lt.chineseExam();
        zs.chineseExam();

    }
}
