package top.zgpv_15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BufferdOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream f = new BufferedOutputStream(new FileOutputStream("test/d.txt"));

        BufferedInputStream r = new BufferedInputStream(new FileInputStream("test/a.txt"));

        ArrayList<Byte> bs = new ArrayList<>();
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = r.read(bytes)) != -1) {
            for (int x = 0; x < len; x++) {
                bs.add(bytes[x]);
            }
        }
        r.close();
        System.out.println(bs);

        byte[] bbs = new byte[bs.size()];
        for (int x = 0; x < bs.size(); x++) {
            bbs[x] = bs.get(x);
        }
        bs.toArray(new Byte[bs.size()]);
        f.write(bbs);
        f.close();
    }
}
