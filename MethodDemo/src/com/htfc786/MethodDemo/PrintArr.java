package com.htfc786.MethodDemo;

public class PrintArr {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        printArr(arr);

        String[] friends = {"杨乐童","姜博轩","吴茗泽","李锦烨"};

        printArr(friends);
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

    public static void printArr(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print("\""+arr[i]+"\"");
            } else {
                System.out.print("\""+arr[i]+"\", ");
            }
        }
        System.out.println("]");
    }
}
