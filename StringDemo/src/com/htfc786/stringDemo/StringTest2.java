package com.htfc786.stringDemo;

public class StringTest2 {
    public static void main(String[] args) {
        /* 给定两个字符串，A和B。
        A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false */

        //1.定义两个字符串
        String strA = "abcdef";
        String strB = "cdefab";


        System.out.println(canMatch(strA,strB));
    }

    public static boolean canMatch(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

//    public static String rotate(String str) {
//        // substring截取
//        return str.substring(1) + str.substring(0,1);
//    }
    public static String rotate(String str) {
        // 字符数组
        char[] charArr = str.toCharArray();
        char first = charArr[0];
        for (int i = 1; i < charArr.length; i++) {
            charArr[i - 1] = charArr[i];
        }
        charArr[charArr.length - 1] = first;
        return new String(charArr);
    }
}
