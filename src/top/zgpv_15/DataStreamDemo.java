package top.zgpv_15;

import java.io.*;
import java.util.Arrays;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void read() throws IOException {
        DataInputStream dr = new DataInputStream(new FileInputStream("test/g.txt"));
        boolean b = dr.readBoolean();
        byte b1 = dr.readByte();
//        byte[] bytes = dr.readAllBytes();
        double v = dr.readDouble();
        float v1 = dr.readFloat();
        int i = dr.readInt();
        long l = dr.readLong();
        dr.close();
        System.out.println(b);
        System.out.println(b1);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(bytes.length);
//        System.out.println(new String(bytes));
        System.out.println(v);
        System.out.println(v1);
        System.out.println(i);
        System.out.println(l);

    }

    private static void write() throws IOException {
        DataOutputStream dw = new DataOutputStream(new FileOutputStream("test/g.txt"));

        dw.writeBoolean(false);
        dw.writeByte(97);
//        dw.writeBytes("hello word");
        dw.writeDouble(12.45);
        dw.writeFloat(13.44F);
        dw.writeInt(12);
        dw.writeLong(12333333);
        dw.close();
    }
}
