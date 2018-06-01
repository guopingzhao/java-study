package top.zgpv_19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        InetAddress address = datagramPacket.getAddress();
        String hostName = address.getHostName();
        int port = datagramPacket.getPort();

        System.out.println(hostName + ":" + port + "传递数据" + new String(data, 0, length));

        datagramSocket.close();
    }
}
