import java.net.*;
import java.io.*;
public class udpserver {
    public static void main(String[] args) throws IOException {
        // System.out.println("waiting for client");
        DatagramSocket ds = new DatagramSocket(6667);
        System.out.println("server started...");
        byte b[]= new byte[1000];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        ds.receive(dp);
        String str= new String(dp.getData());
        System.out.println("received msg : "+ str);
        ds.close();
    }
}
