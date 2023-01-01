package org.example.subscription;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PubSubModelImpl {

    /**
     * Map that contains Sub and Pubs connected to specific Sub
     */
    Map pubSubModel;

    public PubSubModelImpl() {
        this.pubSubModel = new HashMap<Publisher, Subscriber>();
    }

}
