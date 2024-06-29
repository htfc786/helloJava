package com.htfc786.ArrayDemo;

import java.util.Random;

public class ArraySum {
    public static void main(String[] args) {
        /* 遍历数组求和
        需求:
        生成10个1~100之间的随机数存入数组。
        1)求出所有数据的和
        2)求所有数据的平均数
        3)统计有多少个数据比平均值小 */

        int[] nums = new int[10];

        // 生成10个1~100之间的随机数存入数组。
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        //求出所有数据的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("\n所有数据的和:"+sum);

        //求所有数据的平均数
        int ping = sum / nums.length;
        System.out.println("所有数据的平均数:"+ping);

        //统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < ping){
                count++;
            }
        }
        System.out.println(count+"个数据比平均值小");
    }
}
