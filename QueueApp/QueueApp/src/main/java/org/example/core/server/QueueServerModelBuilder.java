package org.example.core.server;

public interface QueueServerModelBuilder {

    public void setServerAddress(String serverAddress);
    public void setServerPort(Integer port);
    public void setStateServer();
    public void setServerName(String serverName);
    public QueueServerModel build();

}
