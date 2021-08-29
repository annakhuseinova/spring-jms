package com.annakhuseinova.springjms.senders;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageSender {

    @Value("${springJms.myQueue}")
    private String queue;
    private final JmsTemplate jmsTemplate;

    public void send(String message){
        MessageCreator messageCreator = session -> session.createTextMessage("Hi!");
        jmsTemplate.send(queue, messageCreator);
    }
}
