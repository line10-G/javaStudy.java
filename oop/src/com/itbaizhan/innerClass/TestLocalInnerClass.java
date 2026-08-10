package com.itbaizhan.innerClass;

/**
 * 测试局部内部类
 */
public class TestLocalInnerClass {
    public void show(){
        //作用域仅限于该方法
        class Inner3{
            public void fun(){
                System.out.println("helloworld");
            }
        }
        new Inner3().fun();
    }
    public static void main(String[] args) {
        new TestLocalInnerClass().show();
    }
}
