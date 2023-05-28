package com.example.simplegroupchat.v1.models;

import com.example.simplegroupchat.v1.enums.MessageType;


public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    // TODO: 5/28/2023  The Getters of the ChatMessage Properties
    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    // TODO: 5/28/2023 The setters of the ChatMessage Properties

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
