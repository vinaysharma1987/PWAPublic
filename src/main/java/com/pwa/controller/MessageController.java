package com.pwa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MessageController {
    @PostMapping("/v1/{toUser}")
    void sendMessage(@RequestBody String message, @PathVariable String toUser)
    {
        log.info("Message : '{}' got from {}", message, toUser);
    }
}
