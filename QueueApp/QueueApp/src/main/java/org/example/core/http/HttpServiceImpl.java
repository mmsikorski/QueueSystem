package org.example.core.http;

import org.example.core.checker.StorageStateChecker;
import org.example.storage.Message;
import org.example.storage.Storage;
import org.example.subscription.SubscriberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Component
public class HttpServiceImpl implements HttpService {

    StorageStateChecker storageStateChecker;

    @Autowired
    public HttpServiceImpl(StorageStateChecker storageStateChecker) {
        this.storageStateChecker = storageStateChecker;
    }

    @Override
    public void makeRequestsToSubs(List<String> subs) {
        HttpURLConnection connection = null;

        String s = SubscriberImpl.subs.get(1);
        String targetURL = "http://localhost:4000/send/message"; // + /{messageValue}
//        String targetURL = s;
//        String messageToReturn;

        for (Message message:
        Storage.messageStorage.values()) {

            if (message.toSend) {
            try {
                message.toSend = false;
                //Create connection
                String urlWithMessage = new StringBuilder().append(s).append(message.messageValue).toString();
                URL url = new URL(urlWithMessage);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);

                //Send request

                //Get Response
                InputStream is = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
                String line;
                while ((line = rd.readLine()) != null) {
                    response.append(line);
                    response.append('\r');
                }
                rd.close();
//                messageToReturn = response.toString();
            } catch (Exception e) {
                e.printStackTrace();

            } finally {
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        }
    }
}
