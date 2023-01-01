package org.testapp.storage;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LocalStorage {

    public static Map<Integer, String> localStorage = new HashMap<>();

    public void putDataToStorage(int i, String messageValue) {
        localStorage.put(i, messageValue);
    }

}
