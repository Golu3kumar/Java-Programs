package JavaNetworkProgramming;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.43.41",6666);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String msgFromServer = "", msgToServer = "";
        while (!msgFromServer.equalsIgnoreCase("stop")){
            msgToServer = bfr.readLine();
            dos.writeUTF(msgToServer);
            dos.flush();

            msgFromServer = dis.readUTF();
            System.out.println("Server Says : "+msgFromServer);

        }

        dis.close();
        dos.close();
        socket.close();
        bfr.close();

    }
}
