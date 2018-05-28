package top.zgpv_15;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("test/a.txt");
        ArrayList<Integer> ints = new ArrayList<>();
        int by;
        while ((by = r.read()) != -1) {
            ints.add(by);
        }
        r.close();
        System.out.println(ints);


        StringBuilder s = new StringBuilder();
        for (int b : ints) {
            s.append((char) b);
        }
        System.out.println(s);

        FileOutputStream w = new FileOutputStream("test/b.txt");
        w.write(s.toString().replace("IO", "java").getBytes());
        w.close();

        FileInputStream r1 = new FileInputStream("test/a.txt");
        List <Byte> bytes = new ArrayList<>();
        byte[] bys = new byte[1024];
        while (r1.read(bys) != -1) {
            for (Byte b : bys) {
                bytes.add(b);
            }
        }
        byte[] bs = new byte[bytes.size()];
        for (int x = 0; x < bytes.size(); x++) {
            bs[x] = bytes.get(x);
        }
        FileOutputStream w2 = new FileOutputStream("test/c.txt");
        w2.write(bs);
        w2.close();
    }
}
