package com.htfc786.ArrayDemo;

public class MaxNum {
    public static void main(String[] args) {
        /*求最值
        需求:已知数组元素为{33,5,22,44,55}
        请找出数组中最大值并打印在控制台 */

//        int[] nums = {33,5,22,44,55};
        int[] nums = {-33,-5,-22,-44,-55};

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }

        System.out.println(max);
    }
}
