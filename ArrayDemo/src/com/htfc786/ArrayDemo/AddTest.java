package com.htfc786.ArrayDemo;

public class AddTest {
    public static void main(String[] args) {
    /* 数组求和：
    定义一个数组，存储1,2,3,4,5
    遍历数组得到每一个元，求数组里面所有的数据和 */

        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
