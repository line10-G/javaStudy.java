package com.itbaizhan.oop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 测试继承
 */

public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("line10",174,"java");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
    }
}

class Person /*extends Object*/{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");
    }
}

class Student extends Person{
//class Student{
//    String name;
//    int height;
//    public void rest(){
//        System.out.println("休息");
//    }
    String major;
    public void study(){
        System.out.println("学习");
    }

    public Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }

}

class Boy extends Person{

}