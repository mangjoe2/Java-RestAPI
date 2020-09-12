package com.spring.idI.configureFolder;

import com.spring.idI.Mocel.Message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    //Take the control over creating new object...

    @Bean//maintain garbage collection
    public Message getMessage(){
        Message message = new Message();
        return message;
    }
    
}