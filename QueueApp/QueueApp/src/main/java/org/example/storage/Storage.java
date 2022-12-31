package org.example.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Storage {

    public static MessageStorage<Integer, Message> messageStorage = new MessageStorage<>();

}
