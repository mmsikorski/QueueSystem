package org.example.subscription;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class SubscriberImpl implements Subscriber {
    public static Map<Integer, String> subs = new HashMap<>() {
        {
            //Test subscriber
            //TODO: Create more elastic logic to add subs dynamically
            put(1, "http://localhost:4000/sub/message/");
        }
    };

    public List<String> getSubUrls() {

        List<String> collect = subs.values().stream().collect(Collectors.toList());
        return collect;
    }
}
