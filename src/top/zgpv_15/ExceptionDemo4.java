package top.zgpv_15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0) {
            System.out.println(a / b);
        }

        String s = "2018-05-27";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);

        System.out.println("over");

        try {
            test(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(test1());

        try {
            check();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void test(int index) throws Exception {
        if (index == 0) {
            throw new Exception("index不能为0");
        }
        System.out.println(index);
    }

    public static List<Integer> test1 () {
        List<Integer> a = Arrays.asList(1);
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            return a;
        } finally {
            a.set(0, 3);
        }
        return a;
    }

    public static void check() throws MyException {
        throw new MyException();
    }
}
