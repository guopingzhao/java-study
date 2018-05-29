package top.zgpv_15;


import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter o = new OutputStreamWriter(new FileOutputStream("test/e.txt", true), "UTF-8");
        o.write("你好！世界！");
        o.close();

        InputStreamReader r = new InputStreamReader(new FileInputStream("test/a.txt"), "UTF-8");

        char[] chars = new char[1024];
        int len = 0;
        while ((len = r.read(chars)) != -1){
            System.out.print(new String(chars, 0, len));
        }
        r.close();
    }
}
