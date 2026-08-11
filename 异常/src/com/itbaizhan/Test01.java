package com.itbaizhan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//测试运行时异常和处理方式（RuntimeException）
public class Test01 {
    public static void main(String[] args) {
        //ArithmeticException
        int b = 0;
        if(b!=0){
            System.out.println(1/b);
        }
        //NullPointException
        String str = null;
        if(str!=null){
            System.out.println(str.charAt(0));
        }
        //ClassCastException
        Animal a = new Cat();
        if(a instanceof Dog){
            Dog d = (Dog)a;
        }
        //IndexOutOfBoundsException
        int[] arr = new int[5];
        int index = 5;
        if(index>=0&&index<arr.length){
            System.out.println(arr[5]);
        }
        //NumberFormatException
        String str2 = "1234abcf";
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(str2);
        if(m.matches()){
            System.out.println(Integer.parseInt(str2));
        }


    }
}


class Animal{
}
class Dog extends Animal{
}
class Cat extends Animal{
}