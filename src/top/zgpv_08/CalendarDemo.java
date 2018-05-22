package top.zgpv_08;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String [] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        System.out.println(year);

        System.out.println("---------------------");

        calendar.add(Calendar.MONTH, 5);

        System.out.println(calendar.get(Calendar.MONTH) + 1);

        calendar.set(Calendar.DATE, 10);

        System.out.println(calendar.get(Calendar.DATE));

        System.out.println(calendar.getTime());

        System.out.println(calendar.getMaximum(Calendar.DATE));
    }
}
