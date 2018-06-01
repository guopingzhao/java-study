package top.zgpv_17;

import java.io.IOException;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();

        Process ls = r.exec("ls");
    }
}
