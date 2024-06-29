package com.htfc786.ArrayDemo;

import java.util.Random;

public class Daluanshuju {
    public static void main(String[] args) {
        /* 打乱数组中的数据
        需求:定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。*/

        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rand_i = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[rand_i];
            arr[rand_i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
