package com.itbaizhan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//测试DateFormat
public class TestDateFormat {

    public static void main(String[] args) throws ParseException {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2049-10-1 10:10:10";
        Date guoqing100 = format.parse(str);
        System.out.println(guoqing100.getTime());
        System.out.println(guoqing100);

        DateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date2 = new Date(2342342342334L);
        String date2Str = format2.format(date2);
        System.out.println(date2Str);

        //小妙招
        Date now = new Date();
        DateFormat f1 = new SimpleDateFormat("今年的第D天，第w周");
        String str3 = f1.format(now);
        System.out.println(str3);

    }

}
