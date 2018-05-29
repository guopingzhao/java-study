package top.zgpv_15;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bs = "你好".getBytes("GBK");
        System.out.println(Arrays.toString(bs));

        String s = new String(bs, "UTF-8");
        System.out.println(s);
    }
}
