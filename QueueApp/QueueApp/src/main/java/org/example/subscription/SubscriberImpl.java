package org.example.subscription;

import java.util.HashMap;
import java.util.Map;

public class SubscriberImpl implements Subscriber {
    public static Map<Integer, String> subs = new HashMap<>() {
        {
            //Test subscriber
            //TODO: Create more elastic logic to add subs dynamically
            put(1, "http://localhost:4000/sub/message/");
        }
    };
}
