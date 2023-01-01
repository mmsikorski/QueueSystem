package org.testapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.testapp.message.MessageReceiver;
import org.testapp.storage.LocalStorage;
import org.testapp.storage.StorageInfo;

@RestController
@RequestMapping("sub/message")
public class GetMessageController {

    private StorageInfo storageInfo;
    MessageReceiver messageReceiver;
    static int requestCounter = 0;

    LocalStorage localStorage;

    @Autowired
    public GetMessageController(MessageReceiver messageReceiver, LocalStorage localStorage, StorageInfo storageInfo) {
        this.messageReceiver = messageReceiver;
        this.localStorage = localStorage;
        this.storageInfo = storageInfo;
    }

    @GetMapping("/{messagevalue}")
    void receiveMessage(@PathVariable String messagevalue) {
        requestCounter++;
        localStorage.putDataToStorage(requestCounter, messagevalue);
        messageReceiver.getMessage(messagevalue);

    }

    @GetMapping
    String infoAboutStorage() {
        return storageInfo.getInfoAboutTotalNumberOfMessages();
    }

}
