package core_java_udemy.networking.basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("waiting for the client connect on port 8080");
            Socket socket = serverSocket.accept();
            System.out.println("Connection established");
            DataInputStream dis = new DataInputStream(socket.getInputStream());//read data come from client
            String data = dis.readUTF();
            System.out.println("Data received: "+data);
            dis.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
