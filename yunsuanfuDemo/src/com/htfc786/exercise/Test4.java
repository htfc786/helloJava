package com.htfc786.exercise;

public class Test4 {
    public static void main(String[] args) {
        int h1 = 150;
        int h2 = 210;
        int h3 = 165;

        int temp = h1 > h2 ? h1 : h2;
        int max = h3 > temp ? h3 : temp;
        System.out.println(max);
    }
}
