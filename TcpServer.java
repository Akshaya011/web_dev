import java.io.*;
import java.net.*;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("waiting for client");
        ServerSocket ss=new ServerSocket(6666);
        Socket s = ss.accept();
        System.out.println("connected to client");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF("greetings from Akshaya");
        ss.close();
    }
}
