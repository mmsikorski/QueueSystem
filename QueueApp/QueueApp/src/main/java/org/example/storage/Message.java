package org.example.storage;

import java.sql.Time;

public final class Message {

    int id;
    public String messageValue;
    public String topic;
    public Boolean toSend;
    public int partition;
    public Time timeAfterThatSendMessage;

    public Message(int id, String messageValue, String topic, Boolean toSend, int partition, Time timeAfterThatSendMessage) {
        this.id = id;
        this.messageValue = messageValue;
        this.topic = topic;
        this.toSend = toSend;
        this.partition = partition;
        this.timeAfterThatSendMessage = timeAfterThatSendMessage;
    }

    public Message(int id, String messageValue, String topic, int partition) {
        this.id = id;
        this.messageValue = messageValue;
        this.topic = topic;
        this.partition = partition;
    }

    public Message(int id, String messageValue, String topic) {
        this.id = id;
        this.messageValue = messageValue;

        //TODO: add more topics listed in enum
        this.topic = topic;
        this.toSend = true;
    }

    public Message(int id, String messageValue) {
        this(id, messageValue, (String) null, true, 0, null);
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
