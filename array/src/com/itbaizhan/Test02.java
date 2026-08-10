package com.itbaizhan;

//测试数组的三种初始化方式
public class Test02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {10,20,30,40};
        Man mans[] = {new Man(1,10),
                new Man(2,20),
                new Man(3,30)};

        System.out.println(a[1]);
        System.out.println(mans[2].getAge());

        //默认初始化
        int a2[] = new int[2];//默认值：0，0
        boolean[] b = new boolean[2];//默认值：false,false
        String[] s = new String[2];//默认值：null,null

    }
}
