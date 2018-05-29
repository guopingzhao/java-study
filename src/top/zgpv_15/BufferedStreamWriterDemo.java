package top.zgpv_15;

import java.io.*;

public class BufferedStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test/a.txt");
        FileWriter fw = new FileWriter("test/f.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

//        char[] chars = new char[1024];
//        int len;
//
//        while ((len = br.read(chars)) != -1) {
//            bw.write(chars, 0, len);
//        }

        while (br.ready()) {
            bw.write(br.readLine());
            bw.newLine();
            bw.flush();
        }
        System.out.println(br.ready());
        br.close();
        bw.close();
    }
}
