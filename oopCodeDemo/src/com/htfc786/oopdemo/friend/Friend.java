package com.htfc786.oopdemo.friend;

public class Friend {
    //朋友对象
    private String name;	// 朋友名字
    private int chinese;	// 语文成绩
    private int physics;	// 物理成绩

    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法
    public Friend(){
        System.out.println("看看我执行了吗?");
    }

    public Friend(String name, int chinese, int physics){
        this.name = name;
        this.chinese = chinese;
        this.physics = physics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setChinese(int chinese) {
        //就可以在这里判断数据是否合法
        if (chinese >= 0 && chinese <= 120){
            this.chinese = chinese;
        } else {
            System.out.println("非法数据！！！");
        }
    }

    public int getChinese() {
        return this.chinese;
    }

    public void setPhysics(int physics) {
        //就可以在这里判断数据是否合法
        if (physics >= 0 && physics <= 100){
            this.physics = physics;
        } else {
            System.out.println("非法数据！！！");
        }
    }

    public int getPhysics() {
        return this.physics;
    }

    public void study(){
        System.out.println(this.name+"正在学习");
        this.chinese++;
        this.physics++;
    }

    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }

    public void chineseExam(){
        System.out.println(this.name+"正在语文考试，"+this.chinese+"分");
    }

    public void pysicsExam(){
        System.out.println(this.name+"正在物理考试，"+this.physics+"分");
    }
}
