import java.net.*;
import java.io.*;
public class udpclient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ss= new DatagramSocket();
        System.out.println("client started...");
        String str= "hello i am cliet";
        byte b[] = str.getBytes();
        InetAddress ia= InetAddress.getLocalHost();
        DatagramPacket dp= new DatagramPacket(b, b.length, ia, 6667);
        ss.send(dp);
        System.out.println("packets send...");
        ss.close();
    }
}
