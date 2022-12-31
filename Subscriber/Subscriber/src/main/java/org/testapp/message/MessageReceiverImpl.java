package org.testapp.message;

import org.springframework.stereotype.Component;

@Component
public class MessageReceiverImpl implements MessageReceiver{

    String receivedMessage;

    @Override
    public void getMessage(String messageValue) {
        receivedMessage = messageValue;
        printMessage();
    }

    @Override
    public void putMessageToLocalStorage() {

    }

    @Override
    public void printMessage() {
        System.out.println(receivedMessage);
    }
}
