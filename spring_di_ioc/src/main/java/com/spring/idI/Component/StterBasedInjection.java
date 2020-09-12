package com.spring.idI.Component;

import com.spring.idI.Service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StterBasedInjection {

    private MessageService messageService;

    public StterBasedInjection(MessageService messageService) {
        this.messageService = messageService;
    }

    @Autowired
    @Qualifier("TextMessageService")
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMsg(String message, String to, String from){
        messageService.sendMessage(message, to, from);

    
}}