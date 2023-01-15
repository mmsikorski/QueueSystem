package org.example.core.server;

public class QueueServerModelImpl implements QueueServerModel {

    String serverName;
    String serverAddress;
    Integer port;

    public QueueServerModelImpl(String serverName, String serverAddress, Integer port) {
        this.serverName = serverName;
        this.serverAddress = serverAddress;
        this.port = port;
    }

}
