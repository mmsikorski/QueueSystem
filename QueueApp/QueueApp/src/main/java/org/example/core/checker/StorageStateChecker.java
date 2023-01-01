package org.example.core.checker;

public interface StorageStateChecker {

    public String checkTotalNumberOfUnsentMessages();

    public String checkTotalNumberOfMessagesInStorage();

    void checkSentMessagesCurrentState();

    void updateSentMessagesState();
}
