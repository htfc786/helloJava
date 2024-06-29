package com.htfc786.ArrayDemo;

public class JiaohuanTest {
    public static void main(String[] args) {
        /* 需求:定义一个数组，存入1,2,3,4,5。交换首尾索引对应的元素。
        交换前:1,2,3,4,5
        交换后:5,2,3,4,1 */
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");

        for (int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
