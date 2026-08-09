package com.itbaizhan.encapsulation.a;

public class Person {
    private         int testPrivate;
                    int testDefault;
    protected       int testProtected;
    public          int testPublic;

    public void test(){
        System.out.println(this.testPrivate);
        System.out.println(this.testDefault);
        System.out.println(this.testProtected);
        System.out.println(this.testPublic);
    }

}
