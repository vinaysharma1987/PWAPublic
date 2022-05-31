package com.pwa.controller;

import com.pwa.MessageDTO.WebSocketRequestMessage;
import com.pwa.service.WebSocketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CommunicationController {

    @Autowired
    WebSocketService webSocketService;

    @MessageMapping("/message/{toUser}")
    public Boolean sendMessage(
            Principal principal,
            @Header String authKey,
            @DestinationVariable String toUser,
            @RequestBody WebSocketRequestMessage message
            )
    {
        log.info("Sending message from {}, to user {}, Auth key {}", principal.getName(), toUser, authKey);
        webSocketService.notifyUser(toUser, message.getMessageContent());
        return Boolean.TRUE;
    }

}
