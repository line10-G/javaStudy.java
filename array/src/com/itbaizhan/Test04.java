package com.itbaizhan;

//测试拷贝
public class Test04 {

    public static void main(String[] args) {
        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        for (int i = 0; i < sBak.length; i++) {
            System.out.println(sBak[i]+ "\t");
        }
    }
}
