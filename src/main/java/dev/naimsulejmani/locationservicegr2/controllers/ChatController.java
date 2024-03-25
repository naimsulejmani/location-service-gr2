package dev.naimsulejmani.locationservicegr2.controllers;


import dev.naimsulejmani.locationservicegr2.dtos.MessageModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;

    public ChatController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public MessageModel sendMessage(@Payload MessageModel model) {
        return model;
    }
    @MessageMapping("/private-message")
    public void sendMessageToUser(@Payload MessageModel model) {
        messagingTemplate.convertAndSendToUser(model.getFrom(),"topic/users", model);;
    }
}














