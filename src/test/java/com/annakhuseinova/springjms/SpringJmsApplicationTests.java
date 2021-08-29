package com.annakhuseinova.springjms;

import com.annakhuseinova.springjms.senders.MessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJmsApplicationTests {

    @Autowired
    private MessageSender messageSender;

    @Test
    void testSendAndReceive() {
        messageSender.send("Hello Spring JMS!");
    }

}
