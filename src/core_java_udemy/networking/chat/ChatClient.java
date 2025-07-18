package core_java_udemy.networking.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",9090);


            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String messageReceived = "", messageToSend="";
            while(true){
                messageToSend = br.readLine();
                dos.writeUTF(messageToSend);
                dos.flush();

                if(messageToSend.equals("exit")){
                    break;
                }
                messageReceived = dis.readUTF();
                System.out.println("SErver says: "+messageReceived);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
