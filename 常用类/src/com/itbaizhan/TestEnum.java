package com.itbaizhan;

import java.util.Random;

//测试枚举
public class TestEnum {

    public static void main(String[] args) {
//        System.out.println(Jijie.SPRING);
//        System.out.println(Season.SPRING);

        for(Season s:Season.values()){
            System.out.println(s);
        }

        int a = new Random().nextInt(4);//生成0,1,2,3随机数
        switch(Season.values()[a]){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
        }

    }

}

enum Season{
    SPRING,SUMMER,AUTUMN,WINTER;
}

class Jijie{
    public static final int SPRING = 0;
    public static final int SUMMER = 1;
    public static final int AUTUMN = 2;
    public static final int WINTER = 3;

}