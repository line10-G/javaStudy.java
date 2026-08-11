package com.itbaizhan;

import java.io.FileReader;

//使用try-with-resource
public class Test04 {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("d:/suep/mycode/java/project/a.txt") ) {
            char c = (char)reader.read();
            char c2 = (char)reader.read();
            char c3 = (char)reader.read();
            System.out.println(""+c+c2+c3);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
