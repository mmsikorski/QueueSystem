package org.example.core.sendjob;

public interface SendJobRunner extends Runnable {

    void turnOnSendingMessages();

    void turnOffSendingMessages();
}
