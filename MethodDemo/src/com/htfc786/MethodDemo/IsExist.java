package com.htfc786.MethodDemo;

public class IsExist {
    public static void main(String[] args) {

        int[] nums = {33,5,22,44,55};

        System.out.println(isExist(nums, 22));
        System.out.println(isExist(nums, 3));
        System.out.println(isExist(nums, 55));
        System.out.println(isExist(nums, 0));
    }

    public static boolean isExist(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
