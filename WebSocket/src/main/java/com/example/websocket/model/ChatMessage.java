package com.example.websocket.model;

import lombok.Data;

@Data
public class ChatMessage {
    private MessageType messageType;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

}
