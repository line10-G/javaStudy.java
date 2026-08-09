package com.itbaizhan.encapsulation.b;

import com.itbaizhan.encapsulation.a.Person;

public class Boy extends Person {
    public void play(){
        System.out.println(super.testProtected);
        System.out.println(super.testPublic);
        //System.out.println(super.testprivate);

        Person p = new Person();
        System.out.println(p.testPublic);
        //System.out.println(p.testProtected);
        /*
        1.若父类和子类在同一个包中，子类可以访问父类的protected成员，也可以访问父类对象的protected成员
        2.若子类和父类不在同一个包中，子类可以访问父类的protected成员，不能访问父类对象的protected成员
         */
    }

}
