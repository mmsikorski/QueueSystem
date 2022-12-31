package org.example.core;

import org.example.storage.Message;
import org.example.storage.MessageTransformer;
import org.example.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class QueueStorageServiceImpl implements QueueStorageService{

    MessageTransformer messageTransformer;

    @Autowired
    public QueueStorageServiceImpl(MessageTransformer messageTransformer) {
        this.messageTransformer = messageTransformer;
    }

    @Override
    public void receiveMessage() {

    }

    @Override
    public void putMessageToStorage(int messageValue) {
//        Message message = messageTransformer.transformMessageFromRest(messageValue);
        Message message = new Message(messageValue, "Message", "Topic");
        Storage.messageStorage.put(messageValue, message);
    }

    @Override
    public String getInfoAboutNumberOfAllMessages() {
        Set<Integer> integers = Storage.messageStorage.keySet();
        StringBuilder stringBuilder = new StringBuilder();

        integers.stream().forEach(x -> {
            stringBuilder.append(Storage.messageStorage.get(x)).toString();
        });

        return stringBuilder.toString();
    }

    @Override
    public void getInfoAboutMessagesLeftToSend() {

    }
}
