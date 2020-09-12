package com.spring.idI.Service;

import org.springframework.stereotype.Service;

@Service("TextMessage")
public class TextMessageService implements MessageService{

    @Override
    public void sendMessage(String message, String to, String from) {
        // TODO Auto-generated method stub

        System.out.println("Text Message " + message+ " to "+ to + " from " + from);
    }
    
}