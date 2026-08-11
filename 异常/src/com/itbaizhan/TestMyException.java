package com.itbaizhan;

//测试自定义异常
class Person{
    private  String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException("人的年龄不应该为负数");
        }
        this.age = age;
    }

    public String toString() {
        return "name is " + name + " and age is " + age;
    }
}
public class TestMyException {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("line10");
        try{
            p.setAge(100);
        }catch (IllegalAgeException e){
            e.printStackTrace();
        }
        System.out.println(p);
    }
}
