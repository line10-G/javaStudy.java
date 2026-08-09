package com.itbaizhan.encapsulation.b;

public class Test {
    public static void main(String[] args) {
        User u =  new User(99,"line10",true);
        u.setId(100);
        u.setName("lisi");
        u.setMan(false);

        System.out.println(u.getName());
        System.out.println(u.isMan());
    }
}
