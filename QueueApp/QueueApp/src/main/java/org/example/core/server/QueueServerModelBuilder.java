package org.example.core.server;

public interface QueueServerModelBuilder {

    public QueueServerModelBuilder builder();
    public QueueServerModelBuilder setServerAddress(String serverAddress);
    public QueueServerModelBuilder setServerPort(Integer port);
    public QueueServerModelBuilder setStateServer();
    public QueueServerModelBuilder setServerName(String serverName);
    public QueueServerModel build();

}
