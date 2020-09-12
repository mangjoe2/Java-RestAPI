package com.spring.idI;

import java.util.Date;

import com.spring.idI.Mocel.Message;
import com.spring.idI.Mocel.User;
import com.spring.idI.configureFolder.App1Congi;
import com.spring.idI.configureFolder.AppConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *--> Inmergion of control: give up something...
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Message message = context.getBean(Message.class);
        message.setMessage("this is message One");
        System.out.println(message.getMessage());
        message.setMessage("This is message Two");
        
        System.out.println(message.getMessage());
        System.out.println(message.hashCode());
        System.out.println(message.hashCode());

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(App1Congi.class);
        User use = context1.getBean(User.class);

        use.setAddress("3325 Willow Crescent Dr");
        use.setName("Joseph");
        use.setId(589);
        use.setHiringDate(new Date());
        System.out.println(use);

        User use1 = context1.getBean(User.class);
        use1.setAddress("3325 Alome");
        use1.setName("Mangazie");
        use1.setId(9689);
        use1.setHiringDate(new Date());

        System.out.println(use1);

        System.out.println(use.hashCode());
        System.out.println(use.hashCode());

        
    }
}
