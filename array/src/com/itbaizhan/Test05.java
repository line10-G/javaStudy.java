package com.itbaizhan;

//测试Arrays类
import java.util.Arrays;
public class Test05 {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println(a);
        for(int i:a){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(a));

        int[] b = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        //返回排序后新的索引位置，若未找到返回负数。
        System.out.println("该元素的索引："+Arrays.binarySearch(b,120));

        int[] c = {10,20,30,40,50};
        Arrays.fill(c,2,4,100);
        System.out.println(Arrays.toString(c));
    }
}
