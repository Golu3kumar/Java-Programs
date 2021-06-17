package practice;

public class MsgBuilder {

    private String senderId;
    private String receiverId;
    private String msg;

    public MsgBuilder setSenderId(String senderId){
        this.senderId = senderId;
        return this;
    }
    public MsgBuilder setReceiverId(String receiverId){
        this.receiverId = receiverId;
        return this;
    }
    public MsgBuilder setMsg(String msg){
        this.msg = msg;
        return this;
    }

    public Msg getMsg(){
        return new Msg(senderId,receiverId,msg);
    }
}
