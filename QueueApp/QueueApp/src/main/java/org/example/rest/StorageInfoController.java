package org.example.rest;

import org.example.core.checker.StorageStateChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage/info")
public class StorageInfoController {

    StorageStateChecker storageStateChecker;

    @Autowired
    public StorageInfoController(StorageStateChecker storageStateChecker) {
        this.storageStateChecker = storageStateChecker;
    }

    @GetMapping("/all")
    public String allMessagesInStorage() {

        return storageStateChecker.checkTotalNumberOfMessagesInStorage();
    }

    @GetMapping("/unsent")
    public String totalNumberOfUnsentMessages() {

        return storageStateChecker.checkTotalNumberOfUnsentMessages();
    }
}
