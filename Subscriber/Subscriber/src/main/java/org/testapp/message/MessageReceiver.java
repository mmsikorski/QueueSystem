package org.testapp.message;

public interface MessageReceiver {

    void getMessage(String messageValue);

    void putMessageToLocalStorage();

    void printMessage();

}
