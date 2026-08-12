package com.itbaizhan;

//测试包装类的使用
public class TestInteger {

    public static void main(String[] args) {
        Integer i = new Integer(50);//从java9开始被废弃
        Integer j = Integer.valueOf(10);//官方推荐

        int a = j.intValue();//把包装类对象转成基本数据类型
        double b = j.doubleValue();

        //把字符串转成数字
        Integer m = Integer.valueOf("456");
//        Integer n = Integer.valueOf("456of");//NumberFormatException

        System.out.println(Integer.MAX_VALUE);

        //测试自动装箱和拆箱
        Integer x = 100;//编译器：Integer x = Integer.valueOf(100);
        int y = x;      //编译器：y = x.intValue();

        Integer z = null;
//        int z2 = z;//编译器：int z2 = z.intValue();//NullPointerException

        //测试缓存问题
        //自动装箱时，[-128,127]之间有缓存！
        Integer x1 = 100;
        Integer x11 = Integer.valueOf(100);
        Integer x2 = 100;
        Integer x3 = 1000;
        Integer x4 = 1000;
        System.out.println(x1 == x2);
        System.out.println(x3 == x4);
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));

    }

}
