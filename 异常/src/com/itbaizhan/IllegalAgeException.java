package com.itbaizhan;

/**IllegalAgeException：非法年龄异常，继承Exception类*/
public class IllegalAgeException extends Exception {
    //默认构造器
    public IllegalAgeException() {
    }
    //带有详细信息的构造器，信息储存在message中
    public IllegalAgeException(String message) {
        super(message);
    }
}
