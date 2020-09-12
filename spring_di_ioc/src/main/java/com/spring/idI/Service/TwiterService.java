package com.spring.idI.Service;

import org.springframework.stereotype.Service;

@Service("TwiterService")
public class TwiterService implements MessageService{

    @Override
    public void sendMessage(String message, String to, String from) {
        // TODO Auto-generated method stub
        System.out.println("Twiter Message "+message+ " to "+ to + " from " + from);

    }
    
}