package top.zgpv_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是日期和字符串相互转换的工具类
 * @author guoping
 */
public final class DateUtil {
    /**
     * 这个方法的作用是把日期转换的方法
     * @param date 要转换的事件对象
     * @param format 要转换的时间格式
     * @return 返回转换好的字符串
     */
    public static String dateToString(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * 这个方法是把字符串转换成时间对象的方法
     * @param str 要转换的时间字符串
     * @param format 时间字符串的格式
     * @return 返回时间对象
     */
    public static Date parse(String str, String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(str);
    }

}
