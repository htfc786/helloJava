package com.htfc786.stringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        String str = arrToString(num);

        System.out.println(str);

    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "{}";
        }
        String res = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                res += arr[i];
                continue;
            }
            res += arr[i] + ", ";
        }
        return res + "}";
    }
}
