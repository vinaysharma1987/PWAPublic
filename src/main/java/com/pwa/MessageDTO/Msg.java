package com.pwa.MessageDTO;

import lombok.*;

import java.util.Date;

public class Msg {

    int mediaType;
    String text;
    int callerId;
    int isGroupCall;
    String groupName;
    long UNIXTime;
    long msgId;
    String senderName;
    int type;

    public Msg() {
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCallerId() {
        return callerId;
    }

    public void setCallerId(int callerId) {
        this.callerId = callerId;
    }

    public int getIsGroupCall() {
        return isGroupCall;
    }

    public void setIsGroupCall(int isGroupCall) {
        this.isGroupCall = isGroupCall;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getUNIXTime() {
        return UNIXTime;
    }

    public void setUNIXTime(long UNIXTime) {
        this.UNIXTime = UNIXTime;
    }


}
