package com.itbaizhan;

import java.util.Arrays;

public class Test09 {

    public static void main(String[] args) {
        Man2[] msMan = {
                new Man2(3,"a"),
                new Man2(60,"b"),
                new Man2(2,"c")};

        System.out.println(Arrays.toString(msMan));
        Arrays.sort(msMan);
        System.out.println(Arrays.toString(msMan));
    }

}

class Man2 implements Comparable{
    int age;
    int id;
    String name;

    public Man2(int age,String name){
        super();
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return this.name;
    }

    public int compareTo(Object o){
        Man2 man2 = (Man2) o;
        if (this.age<man2.age){
            return -1;
        }
        if (this.age>man2.age){
            return 1;
        }
        return 0;
    }
}
