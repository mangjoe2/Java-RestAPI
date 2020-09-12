package com.spring.idI.Service;

import org.springframework.stereotype.Service;

@Service("EmailMessage")
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message, String to, String from) {
        // TODO Auto-generated method stub

        System.out.println("Email Message "+ message+ " to "+ to + " from " + from);

    }
    
}