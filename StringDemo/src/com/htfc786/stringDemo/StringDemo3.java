package com.htfc786.stringDemo;

public class StringDemo3 {
    public static void main(String[] args) {

        String str = reverser("杨乐童太强了！！！");
        System.out.println(str);
    }

    public static String reverser(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
