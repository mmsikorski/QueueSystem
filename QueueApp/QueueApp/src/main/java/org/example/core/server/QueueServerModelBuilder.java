package org.example.core.server;

public interface QueueServerModelBuilder {

    public QueueServerModelBuilder setServerAddress(String serverAddress);
    public QueueServerModelBuilder setServerPort(Integer port);
    public QueueServerModelBuilder setStateServer();
    public QueueServerModelBuilder setServerName(String serverName);

    public String getServerAddress();

    public Integer getServerPort();

    public ServerState getServerState();

    public String getServerName();

    public QueueServerModel build();

}
