package com.example.android.bluetoothchat;

public class Chats {

    private String deviceName, connectedDeviceName, textMessage;

    public Chats(String mConnectedDeviceName) {
    }

    public Chats(String mConnectedDeviceName, String devName, String text) {
    }

    public String getDeviceName() {
        return deviceName;
    }


    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setConnectedDeviceName(String connectedDeviceName) {
        this.connectedDeviceName = connectedDeviceName;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getConnectedDeviceName() {
        return connectedDeviceName;
    }

    public String getTextMessage() {
        return textMessage;
    }
}
