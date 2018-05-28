package top.zgpv_15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("test");
        file.mkdirs();
//        FileOutputStream f = new FileOutputStream(file);
        FileOutputStream f = new FileOutputStream("test/a.txt", true);
        byte[] bytes = "hello word! IO! \r".getBytes();
        f.write(bytes);
        f.write(bytes, bytes.length - 6, 6);
        f.write(65);
        f.close();
    }

}
