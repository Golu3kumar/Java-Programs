package JavaNetworkProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    // Server class
    public static void main(String[] args) throws Exception {

        // Creating Server Socket
        ServerSocket ss = new ServerSocket(6666);
        // established the connection with client and waiting for it's connection request
        Socket socket = ss.accept();
        if (socket != null)
            System.out.println("Connection Created!");
        // these classes used for reading and writing data in primitive format.
        DataInputStream dis = new DataInputStream(socket.getInputStream());


        String msgFromClient = "";

        while (!msgFromClient.equalsIgnoreCase("stop")){
            msgFromClient = dis.readUTF();
            System.out.println("Client Says : "+msgFromClient);
        }

        dis.close();
        socket.close();
        ss.close();
    }
}
