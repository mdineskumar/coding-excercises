package core_java_udemy.networking.chat;

import core_java_udemy.networking.basics.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Server waiting for client to connect");
            Socket socket = serverSocket.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String messageReceived = "", messageToSend="";
            while(true){
                messageReceived = dis.readUTF();

                System.out.println("Client says "+messageReceived);
                if(messageReceived!=null && messageReceived.equals("exit")){
                    break;
                }
                messageToSend=br.readLine();
                dos.writeUTF(messageToSend);
                dos.flush();
            }

            br.close();
            dos.close();
            dis.close();
            socket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
