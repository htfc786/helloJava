package com.htfc786.ArrayDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        // 取
        int num0 = arr[0];
        System.out.println(num0);//1

        System.out.println(arr[2]);//3

        // 存
        //一旦覆盖之后，原来的数字就不复存在了！
        arr[0] = 114;

    }
}
