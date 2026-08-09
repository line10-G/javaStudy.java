package com.itbaizhan.oop;

/**
 * 测试组合
 */

public class TestComponent {

}

class Person2 /*extends Object*/{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");
    }
}

class Student2 /*extends Person2*/{
//class Student{
    //String name;
    //int height;
    //public void rest(){
    //  System.out.println("休息");
    //}
    Person2 person2 = new Person2();

    String major;
    public void study(){
        System.out.println("学习");
        person2.rest();
        System.out.println(this.person2.name);
    }

    public Student2(String name,int height,String major){
        this.person2.name=name;
        this.person2.height=height;
        this.major=major;
    }

}

class Boy2 extends Person{

}