package com.htfc786.MethodDemo;

public class ArrayMax {
    public static void main(String[] args) {

        int[] nums = {33,5,22,44,55};

        int max = getMax(nums);

        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
