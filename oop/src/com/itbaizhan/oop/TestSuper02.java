package com.itbaizhan.oop;
//继承树的追溯
public class TestSuper02 {
    public static void main(String[] args) {
        new ChildClass2();
    }
}

class FatherClass2{
    static{
        System.out.println("静态初始化：FatherClass2");
    }
    public FatherClass2() {
        super();
        System.out.println("创建FatherClass2");
    }
}

class ChildClass2 extends FatherClass2{
    static{
        System.out.println("静态初始化：ChildClass2");
    }
    public ChildClass2() {
        super();//在一个类中，若是构造方法的第一行没有调用super()或者this();那么Java默认都会调用super();
        System.out.println("创建ChildClass2");
    }
}