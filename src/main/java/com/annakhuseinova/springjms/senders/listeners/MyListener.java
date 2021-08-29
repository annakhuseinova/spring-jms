package com.annakhuseinova.springjms.senders.listeners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @JmsListener(destination = "${springJms.myQueue}")
    public void receive(String message){
        System.out.println("Message received: " + message);
    }
}
