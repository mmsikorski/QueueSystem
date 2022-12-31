package org.example.storage;

public interface MessageTransformer {

    Message transformMessageFromRest(String messageValue);
}
