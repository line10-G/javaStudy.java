package com.itbaizhan;

//测试字符串相关内容
public class TestString {

    public static void main(String[] args) {
        String str = "abc";
//        StringBuilder sb = new StringBuilder("abc");
//        StringBuffer sb2 = new StringBuffer("abc");

        /**StringBuilder*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb.append((char)('a'+i));//追加单个字符
        }
        System.out.println(sb.toString());//转换为String输出
//        sb.append("1").append("2").append("3");
        sb.append(", I can sing my abc!");//追加字符串
        System.out.println(sb.toString());

        /**StringBuffer,下面方法同样适用StringBuilder*/
        StringBuffer sb2 = new StringBuffer("北京尚学堂");
        sb2.insert(0,"爱").insert(0,"我");//插入字符串
        System.out.println(sb2);
        sb2.delete(0,2);//删除子字符串
        System.out.println(sb2);
        sb2.deleteCharAt(0).deleteCharAt(0);//删除某个字符
        System.out.println(sb2.charAt(0));//获取某个字符
        System.out.println(sb2.reverse());//字符串逆序





    }

}
