package org.example.core.server;

public class QueueServerModelBuilderImpl implements QueueServerModelBuilder {

    String serverName;
    String serverAddress; //Default value is null
    Integer port; //Default value is 0



    @Override
    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @Override
    public void setServerPort(Integer port) {
        this.port = port;
    }

    @Override
    public void setStateServer() {

    }

    @Override
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public QueueServerModel build() {

        return new QueueServerModelImpl(serverAddress, serverAddress, port);
    }
}
