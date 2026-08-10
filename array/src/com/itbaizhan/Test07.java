package com.itbaizhan;

import java.util.Arrays;

//测试Object[][]二维数组存储表格数据
public class Test07 {

    public static void main(String[] args) {
        Object[] a1 = {1001,"line1",18,"讲师","2-14"};
        Object[] a2 = {1002,"line8",19,"助教","10-10"};
        Object[] a3 = {1003,"line10",20,"班任","5-5"};
        Object[][] emps = new Object[3][];
        emps[0]=a1;
        emps[1]=a2;
        emps[2]=a3;
        System.out.println(Arrays.deepToString(emps[0]));
        System.out.println(Arrays.deepToString(emps[1]));
        System.out.println(Arrays.deepToString(emps[2]));

        System.out.println("============================");
        for (int i=0;i<emps.length;i++){
            for (int j=0;j<emps[i].length;j++){
                System.out.print(emps[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
