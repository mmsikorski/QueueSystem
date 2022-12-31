package org.example;


import org.example.core.IMessageLoader;
import org.example.core.MessageLoader;

public class Main {
    public static void main(String[] args) {

        IMessageLoader messageLoader = new MessageLoader();

        String message = messageLoader.getMessage();
        System.out.println(message);
        String message1 = messageLoader.getMessage();
        System.out.println(message1);

        System.out.println("Hello world!");
        for (int i = 0; i < 10000; i++) {
            String message2 = messageLoader.getMessage();
            System.out.println(message2);
        }
    }
}