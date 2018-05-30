package top.zgpv_15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        p.put("a", 1);
        p.setProperty("b", "2");

        p.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println(p);
        System.out.println(p.getProperty("a"));
        System.out.println(p.getProperty("b"));
        System.out.println(p.stringPropertyNames());

        System.out.println("===============================");

        Properties p2 = new Properties();
        FileReader r = new FileReader("test/prop.txt");
        p2.load(r);
        r.close();
        System.out.println(p2);

        FileWriter w = new FileWriter("test/prop2.txt");
        p2.store(w, "a");
        w.close();
        System.out.println("===============================");

        Properties p3 = new Properties();
        p3.load(new FileReader("test/prop2.txt"));

        System.out.println(p3);
    }
}
