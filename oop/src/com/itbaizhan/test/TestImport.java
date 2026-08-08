package com.itbaizhan.test;

/**
  测试导入import
 */

import com.itbaizhan.oop.car;
import java.util.*;//导入该包下所有的类。会降低编译速度，但不会降低运行速度
import static java.lang.Math.*;//导入Math类的所有静态属性
import static java.lang.Math.PI;//导入Math类的PI属性

public class TestImport {
    public static void main(String[] args) {
        //com.itbaizhan.oop.car car = new com.itbaizhan.oop.car();
        car c1 = new car();
        car c2 = new car();
        //String str;
        //java.lang.String str2;

        System.out.println(PI);
        System.out.println(random());

    }
}
