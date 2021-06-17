package practice;

public class Msg {

    private String senderId;
    private String receiverId;
    private String msg;

    public Msg(String senderId, String receiverId, String msg) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "senderId='" + senderId + '\'' +
                ", receiverId='" + receiverId + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
