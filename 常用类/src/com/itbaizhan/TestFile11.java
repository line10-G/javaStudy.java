package com.itbaizhan;

import java.io.File;
import java.util.Date;

//创建文件以及相对路径、获取项目路径
public class TestFile11 {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        File f = new File("a1.txt");//相对路径：默认放到user.dir目录下面
        f.createNewFile();//创建文件

        File f2 = new File("d:/suep/mycode/java/b.txt");//绝对路径
        f2.createNewFile();
        f2.delete();

        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录绝对路径："+f.getAbsolutePath());

        File f3 = new File("d:/suep/mycode/java/testFile");
//        boolean flag = f3.mkdir();//目录结构中有一个不存在，则不会创建整个目录树
//        System.out.println(flag);//失败
        boolean flag2 = f3.mkdirs();//目录结构中有多个不存在没关系，创建整个目录树
        System.out.println(flag2);//成功


    }
}
