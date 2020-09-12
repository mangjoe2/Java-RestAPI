package com.spring.idI.configureFolder;

import com.spring.idI.Mocel.Message;
import com.spring.idI.Mocel.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App1Congi {
    
    @Bean
    public User getUser(){
        User user = new User();
        return user;
    }

    @Bean//maintain garbage collection
    public Message getMessage(){
        Message message = new Message();
        return message;
    }
}