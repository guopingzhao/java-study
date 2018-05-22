package top.zgpv_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(System.currentTimeMillis());

        System.out.println("------------------");


        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String s = simpleFormatter.format(date);
        System.out.println(s);

        System.out.println("------------------");

        String str = "2018-05-22 09:52:54";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date1 = simpleDateFormat.parse(str);
        System.out.println(date1);

        System.out.println("-------------------");



    }
}
