package com.htfc786.ArrayDemo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //数组异常
        String[] arr = {"杨乐童","姜博轩","吴茗泽","李锦烨"};

        System.out.println(arr[0]);//杨乐童
        System.out.println(arr[10]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        System.out.println(arr[1]);//不会运行

//        索引越界异常
//        原因:访问了不存在的索引
//        避免:索引的范围
//        最小索引:0
//        最大索引:(数组的长度-1)
    }
}
