import java.io.*;
import java.net.*;
public class TcpClient{
    public static void main(String[] args) throws IOException {
        Socket s= new Socket("localhost",6666);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        System.out.println(in.readUTF());
        s.close();
    }
}