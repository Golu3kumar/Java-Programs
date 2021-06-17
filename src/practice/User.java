package practice;

import java.util.Scanner;

public class User {
    public static final String senderId = "Nikhil@123";
    public static final String receiverId = "Kartik#123";
    static Scanner sc = new Scanner(System.in);

    static void sendMsg(String msg){
        MsgBuilder msgBuilder = new MsgBuilder();
        msgBuilder.setSenderId(senderId)
                .setReceiverId(receiverId)
                .setMsg(msg);

        Msg msgObj = msgBuilder.getMsg();
        System.out.println(msgObj);
    }
    public static void main(String[] args) {
        System.out.print(">Enter msg : ");
        String msg = sc.nextLine();
        sendMsg(msg);
    }
}
