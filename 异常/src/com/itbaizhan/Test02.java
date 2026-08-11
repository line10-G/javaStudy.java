package com.itbaizhan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//测试CheckException（已检查异常，编译器报错）
public class Test02 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("d:/suep/mycode/java/project/a.txt");
            char c = (char)reader.read();
            char c2 = (char)reader.read();
            char c3 = (char)reader.read();
            System.out.println(""+c+c2+c3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Test02.main.finally");;
            try {
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
