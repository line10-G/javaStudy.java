package com.itbaizhan.innerClass;

public class TesrInner {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();

        inner.show();
    }
}
