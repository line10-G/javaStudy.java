package com.itbaizhan;

//测试断点
public class TestBreakPoint {
    private int num = 10;

    public void run(int a){
        System.out.println("TestBreakPoint.run");
        for(int i=0;i<a;i++){
            num += a;
            go();
        }
    }

    public void go(){
        System.out.println("TestBreakPoint.go");
        System.out.println("num="+num);
    }

    public static void main(String[] args){
        new TestBreakPoint().run(5);
    }
}
