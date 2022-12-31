package org.example.rest;


import org.example.core.QueueStorageService;
import org.example.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/message")
@RestController
public class MessageController {

    QueueStorageService queueStorageService;

    @Autowired
    public MessageController(QueueStorageService queueStorageService) {
        this.queueStorageService = queueStorageService;
    }

    @GetMapping("/routemessage/{message}")
    void messageRouter(@PathVariable int message) {
        queueStorageService.putMessageToStorage(message);
    }

    @GetMapping("/allmesages")
    String getInfoAllMessagesInStorage() {
        return queueStorageService.getInfoAboutNumberOfAllMessages();
    }

    @GetMapping("/total")
    int totalNumberOfReceivedMessages() {
        int size = Storage.messageStorage.keySet().size();
        return size;
    }
}
