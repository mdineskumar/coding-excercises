package core_java_udemy.networking.basics;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF("Java Sockets are cool");
            dos.close();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
