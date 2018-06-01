package top.zgpv_19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String str = "hello word";
        byte[] bytes = str.getBytes();

        InetAddress localHost = InetAddress.getLocalHost();

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, localHost ,10086);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
