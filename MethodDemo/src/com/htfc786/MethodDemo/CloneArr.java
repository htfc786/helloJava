package com.htfc786.MethodDemo;

public class CloneArr {
    public static void main(String[] args) {
        //数组浅克隆

        int[] arr = {33,5,22,44,55};
        System.out.println(arr);

        int[] arr1 = arr;
        System.out.println(arr1);

        int[] arr2 = cloneArr(arr);
        System.out.println(arr2);

    }

    public static int[] cloneArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
