package com.htfc786.ArrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] age = new int[]{15,14,13,12,11};
        int[] age2 = {15,14,13,12,11};

        System.out.println(age);// [I@1b6d3586

        String[] name = new String[]{"杨乐童","姜博轩","吴茗泽"};
        String[] name2 = {"杨乐童","姜博轩","吴茗泽"};

        System.out.println(name);// [Ljava.lang.String;@4554617c

        double[] height = new double[]{1.79,1.75,1.63};
        double[] height2 = {1.79,1.75,1.63};

        System.out.println(height);// [D@1b6d3586

        // 扩展:
        //  解释一下地址值的格式含义 [D@1b6d3586
        //  [:表示当前是一个数组
        //  D:表示当前数组单面的元素都是double类型的
        //  @:表示一个间隔符号。(固定格式)
        //  1b6d3586:是数组真正的地址值。(十六进制)
        //  平时我们习惯性的会把这个整体叫做数组的地址值。




    }
}
