package com.itbaizhan.oop;

import org.omg.CORBA.ShortSeqHelper;

/**
 * 测试方法的重写
 */

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        Plane p = new Plane();
        h.run();
        h.getVehicle();
        p.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("跑。。。");
    }

    public Vehicle getVehicle(){
        System.out.println("给你一个交通工具！");
        return null;
    }
}

class Horse extends Vehicle{
    @Override
    public void run(){
        System.out.println("得得得。。。");
    }
    @Override
    public Horse getVehicle(){
        return new Horse();
    }
}

class Plane extends Vehicle{
    @Override
    public void run(){
        System.out.println("天上飞");
    }
}