package com.itbaizhan.testInterface;

public class Test {

    public static void main(String[] args) {
        Plane p = new Plane();
        Angel a = new Angel();
        a.fly();
        a.helpOther();
        System.out.println(Volant.Fly_HIGHT);

        Volant a2 = new Angel();
        a2.fly();

        System.out.println("=========测试默认方法=======");
        TestDefault td = new TestDefaultImpl01();
        td.printInfo();
        td.moren();
        System.out.println("=========测试静态方法=======");
        TestDefault.testStatic01();
        TestDefaultImpl01.testStatic01();
    }

}
