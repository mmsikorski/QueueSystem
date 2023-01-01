package org.testapp.storage;

import org.springframework.stereotype.Component;

@Component
public class StorageInfo {

    public String getInfoAboutTotalNumberOfMessages() {
        return new StringBuilder().append(LocalStorage.localStorage.values().size()).toString();
    }
}
