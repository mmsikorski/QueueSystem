package org.example.core;

public interface QueueStorageService {

    void receiveMessage();

    void putMessageToStorage(int messageValue);

    String getInfoAboutNumberOfAllMessages();

    void getInfoAboutMessagesLeftToSend();



}
