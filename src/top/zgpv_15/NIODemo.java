package top.zgpv_15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NIODemo {
    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("test/a.txt"), new FileOutputStream("test/h.txt"));

        ArrayList<String> as = new ArrayList<>();
        as.add("aaaaa");

        Files.write(Paths.get("test/j.txt"), as, Charset.forName("GBK"));
    }
}

