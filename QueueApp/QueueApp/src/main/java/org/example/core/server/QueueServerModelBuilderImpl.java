package org.example.core.server;

public class QueueServerModelBuilderImpl implements QueueServerModelBuilder {

    public String serverName;
    public String serverAddress; //Default value is null
    public Integer port; //Default value is 0

    public ServerState serverState;


    @Override
    public QueueServerModelBuilder setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
//        this.serverAddress = serverAddress;
        return this;
    }

    @Override
    public QueueServerModelBuilder setServerPort(Integer port) {
        this.port = port;
//        this.port = port;
        return this;

    }

    @Override
    public QueueServerModelBuilder setStateServer() {
    //not finished yet
        return this;
    }

    @Override
    public QueueServerModelBuilder setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    @Override
    public String getServerAddress() {
        return serverAddress;
    }

    @Override
    public Integer getServerPort() {
        return port;
    }

    @Override
    public ServerState getServerState() {
        return serverState;
    }

    @Override
    public String getServerName() {
        return serverName;
    }


    @Override
    public QueueServerModel build() {

        return new QueueServerModelImpl(this);
    }
}
