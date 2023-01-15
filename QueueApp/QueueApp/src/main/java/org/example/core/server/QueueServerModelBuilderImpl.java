package org.example.core.server;

public class QueueServerModelBuilderImpl implements QueueServerModelBuilder {

    QueueServerModelBuilderImpl builder;
    public String serverName;
    public String serverAddress; //Default value is null
    public Integer port; //Default value is 0



    @Override
    public QueueServerModelBuilder builder() {
        this.builder = new QueueServerModelBuilderImpl();
        return this.builder;
    }

    @Override
    public QueueServerModelBuilder setServerAddress(String serverAddress) {
        this.builder.serverAddress = serverAddress;
//        this.serverAddress = serverAddress;
        return this.builder;
    }

    @Override
    public QueueServerModelBuilder setServerPort(Integer port) {
        this.builder.port = port;
//        this.port = port;
        return this.builder;

    }

    @Override
    public QueueServerModelBuilder setStateServer() {
    //not finished yet
        return this.builder;
    }

    @Override
    public QueueServerModelBuilder setServerName(String serverName) {
        this.builder.serverName = serverName;
        return this.builder;
    }

    @Override
    public QueueServerModel build() {

        return new QueueServerModelImpl(serverAddress, serverAddress, port);
    }
}
