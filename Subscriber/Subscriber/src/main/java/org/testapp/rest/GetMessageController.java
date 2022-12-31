package org.testapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testapp.message.MessageReceiver;

@RestController
@RequestMapping("sub/message")
public class GetMessageController {

    MessageReceiver messageReceiver;

    @Autowired
    public GetMessageController(MessageReceiver messageReceiver) {
        this.messageReceiver = messageReceiver;
    }

    @PostMapping("/{messagevalue}")
    void receiveMessage(@PathVariable String messagevalue) {
        messageReceiver.getMessage(messagevalue);

    }
}
