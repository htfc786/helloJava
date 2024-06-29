package com.htfc786.oopdemo.student;

public class StudentTest {
    public static void main(String[] args) {
        /* 对象数组5
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息
              如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁 */

        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "杨乐童", 15);
        Student stu2 = new Student(2, "姜博轩", 15);
        Student stu3 = new Student(3, "吴茗泽", 16);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        System.out.println("==================");

        // 要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        // 再次添加一个学生对象
        Student newStu = new Student(4, "李锦烨", 15);

        //判断唯一性
        if (isHas(arr, newStu.getId())) {
            // 已存在
            System.out.println("当前id已经存在，添加失败");
        } else {
            // 未存在
            // 判断数组是否已满
            if (getCount(arr) <= arr.length) {
                // 数组已满，创建新数组
                Student[] newArr = new Student[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            arr[arr.length - 1] = newStu;
        }
        System.out.println("==================");

        // 要求2:添加完毕之后，遍历所有学生信息。
        printArr(arr);
        System.out.println("==================");

        //要求3:通过id删除学生信息
        //      如果存在，则删除，如果不存在，则提示删除失败。
        int delId = 3;
        int index = getIndex(arr, delId);
        if (index == -1) {
            System.out.println("当前id不存在，删除失败");
        } else {
            arr[index] = null;
        }
        System.out.println("==================");

        //要求4:删除完毕之后，遍历所有学生信息。
        printArr(arr);
        System.out.println("==================");

        //要求5:查询数组id为2的学生，如果存在，则将他的年龄+1岁
        int selectId = 2;
        int selectIdx = getIndex(arr, selectId);
        if (selectIdx == -1) {
            System.out.println("当前id不存在，修改失败");
        } else {
            int age = arr[selectIdx].getAge();//年龄
            arr[selectIdx].setAge(age + 1);
        }
        printArr(arr);

    }

    // 根据id得到数组下标
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    // 打印信息
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            System.out.println(arr[i].getId() + "\t" + arr[i].getName() + "\t" + arr[i].getAge());
        }
    }

    // 判断id唯一性
    public static boolean isHas(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}
