package org.example.core.checker;

import org.example.storage.Storage;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class StorageStateCheckerImpl implements StorageStateChecker{


    @Override
    public String checkTotalNumberOfUnsentMessages() {
        int size = Storage.messageStorage.keySet().stream()
                .map(x -> Storage.messageStorage.get(x))
                .filter(x -> x.toSend)
                .collect(Collectors.toList()).size();

        return "Messages left to send: " + size;

    }

    @Override
    public String checkTotalNumberOfMessagesInStorage() {

        int size = Storage.messageStorage.keySet().size();
        String s = new StringBuilder().append("Total number of messages in storage: ").append(size).toString();
        return s;
    }

    @Override
    public void checkSentMessagesCurrentState() {

    }

    @Override
    public void updateSentMessagesState() {

    }
}
