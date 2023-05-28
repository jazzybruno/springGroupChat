package com.example.simplegroupchat.v1.controllers;

import com.example.simplegroupchat.v1.models.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage){
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage , SimpMessageHeaderAccessor headerAccessor    ){
        // TODO: 5/28/2023  add  username in webscoket session
        headerAccessor.getSessionAttributes().put("username" , chatMessage.getSender());
        return chatMessage;
    }

}
