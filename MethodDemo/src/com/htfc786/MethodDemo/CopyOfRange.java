package com.htfc786.MethodDemo;

public class CopyOfRange {
    public static void main(String[] args) {
        /* 复制数组
        需求:定义一个方法copyOfRange(int[] arr,int from, int to)
        功能:将数组arr中从索引from(包含from)开始。
             到索引to结束(不包含to)的元素复制到新数组中，
             将新数组返回。 */

        int[] arr = {33,5,22,44,55};
        printArr(arr);

        int[] arr2 = copyOfRange(arr,1,3);
        printArr(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        for (int i=from,new_i=0; i < to; i++,new_i++) {
            newArr[new_i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
