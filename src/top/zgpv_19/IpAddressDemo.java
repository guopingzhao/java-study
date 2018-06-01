package top.zgpv_19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("30.20.92.32");
        String hostName = inetAddress.getHostName();
        String hostAddress = inetAddress.getHostAddress();

        System.out.println(hostName+": "+hostAddress);

        System.out.println("========================================");

        InetAddress localHost = InetAddress.getLocalHost();
        String hostName1 = localHost.getHostName();
        String hostAddress1 = localHost.getHostAddress();
        System.out.println(hostName1 + ": " + hostAddress1);

    }
}
