package org.example.sender;

import org.example.subscription.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMessageServiceImpl {

    Subscriber subscriber;

    @Autowired
    public SendMessageServiceImpl(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public void sendMessagesToSubs() {

    }
}
