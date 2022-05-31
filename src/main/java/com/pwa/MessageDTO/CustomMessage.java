package com.pwa.MessageDTO;

public class CustomMessage {
    boolean addMsg;
    int groupId;
    int msgType;
    int isMyself;
    int status;
    String receiverId;
    String senderId;

    long unixTimestamp;


    String first_name;
    String last_name;
    String senderName;

    Msg message;

    public CustomMessage() {
    }

    public CustomMessage(boolean addMsg, int groupId, int msgType, int isMyself, int status, String senderId, String receiverId, long unixTimestamp, String first_name, String last_name, String senderName, Msg message) {
        this.addMsg = addMsg;
        this.groupId = groupId;
        this.msgType = msgType;
        this.isMyself = isMyself;
        this.status = status;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.unixTimestamp = unixTimestamp;
        this.first_name = first_name;
        this.last_name = last_name;
        this.senderName = senderName;
        this.message = message;
    }



    public boolean isAddMsg() {
        return addMsg;
    }

    public void setAddMsg(boolean addMsg) {
        this.addMsg = addMsg;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public int getIsMyself() {
        return isMyself;
    }

    public void setIsMyself(int isMyself) {
        this.isMyself = isMyself;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public long getUnixTimestamp() {
        return unixTimestamp;
    }

    public void setUnixTimestamp(long unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Msg getMessage() {
        return message;
    }

    public void setMessage(Msg message) {
        this.message = message;
    }

}
