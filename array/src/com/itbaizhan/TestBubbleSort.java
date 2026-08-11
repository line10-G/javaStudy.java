package com.itbaizhan;

import java.util.Arrays;
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values =  {3,1,6,8,9,0,7,4,5,2};
        System.out.println("原始顺序："+Arrays.toString(values));
        bubbleSort(values);
        //bubbleSort2(values);//优化后的冒泡排序算法
    }

    public static void bubbleSort(int[] values){
        int temp;
        for(int i=0;i<values.length-1;i++){
            for(int j=0;j<values.length-i-1;j++){
                if(values[j]>values[j+1]){
                    temp=values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;
                }
            }
            System.out.println((i+1)+"趟排序："+Arrays.toString(values));
        }
    }

    //优化后的冒泡排序算法
    public static void bubbleSort2(int[] values){
        int temp;

        for(int i=0;i<values.length-1;i++){
            //定义一个布尔类型的变量，标记数组是否已达到有序状态
            boolean flag=true;
            /*内层循环：每一趟循环都从数列的前两个元素开始比较，比较到无需数组的最后*/
            for(int j=0;j<values.length-i-1;j++){
                //如果前一个元素大于后一个元素，则交换两元素的值
                if(values[j]>values[j+1]){
                    temp=values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;
                    //本趟发生了交换，表明该数组本趟处于无序状态，需要继续比较
                    flag=false;
                }
            }

            //根据标记量的值判断数组是否有序，如果有序，则退出，无序，则继续循环
            if(flag){
                break;
            }
            System.out.println((i+1)+"趟排序："+Arrays.toString(values));
        }

    }
}
