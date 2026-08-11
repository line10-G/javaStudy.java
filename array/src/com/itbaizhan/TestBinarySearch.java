package com.itbaizhan;

import  java.util.Arrays;
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
        int searchWord = 20; //要查找的数
        Arrays.sort(arr); //二分法之前要对数组元素排序

        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord+"元素的索引："+binarySearch(arr,searchWord));
    }

    public static int binarySearch(int[] arr,int searchWord){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==searchWord){
                return mid;
            }
            else if(arr[mid]>searchWord){
                high = mid-1;
            }
            else if(arr[mid]<searchWord){
                low = mid+1;
            }
        }
        return -1;
    }
}
