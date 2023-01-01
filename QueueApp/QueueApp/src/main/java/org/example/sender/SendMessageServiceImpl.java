package org.example.sender;

import org.example.core.http.HttpService;
import org.example.subscription.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Component
public class SendMessageServiceImpl implements SendMessageService{


    public HttpService httpService;
    Subscriber subscriber;
    List<String> subUrls;

    @Autowired
    public SendMessageServiceImpl(Subscriber subscriber, HttpService httpService) {
        this.subscriber = subscriber;
        this.httpService = httpService;
        subUrls = new ArrayList<>();
    }

    @Override
    public void sendMessagesToSubs() {
        List<String> subUrls1 = subscriber.getSubUrls();
        httpService.makeRequestsToSubs(subUrls1);
//        subscriber.

//        httpService.makeRequestsToSubs();
    }
}
