package org.example.storage;

public final class Message {

    int id;
    String messageValue;
    String topic;

    public Message(int id, String messageValue, String topic) {
        this.id = id;
        this.messageValue = messageValue;

        //TODO: add more topics listed in enum
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", messageValue='" + messageValue + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
