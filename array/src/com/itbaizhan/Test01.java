package com.itbaizhan;

//数组声明和创建
public class Test01 {

    public static void main(String[] args) {
        int[] s;        //声明
        s = new int[10];//创建

        System.out.println(s[0]);
        System.out.println(s[1]);
        s[0] = 10;
        s[1] = 20;
        s[2] = 30;
        System.out.println(s[1]);

        //动态初始化
        for (int i=0;i<10;i++) {
            s[i] = 2*i+1;
        }

        for (int j=0;j<10;j++) {
            System.out.println(s[j]);
        }

        Man[] mans = new Man[10];
        Man m1 = new Man(1,11);
        Man m2 = new Man(2,22);

        mans[0] = m1;
        mans[1] = m2;

        System.out.println(mans[0].getId());
        System.out.println(mans[1].getAge());
    }
}

class Man{
    private int age;
    private int id;
    public Man(int id,int age){
        super();
        this.age=age;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

