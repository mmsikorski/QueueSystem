package org.example.core.server;

public class QueueServerModelImpl implements QueueServerModel {

    String serverName;
    String serverAddress;
    Integer port;

    public QueueServerModelImpl(QueueServerModelBuilderImpl builder) {
        this.serverName = builder.getServerName();
        this.serverAddress = builder.getServerAddress();
        this.port = builder.getServerPort();
    }

    @Override
    public QueueServerModelBuilder builder() {
        return new QueueServerModelBuilderImpl();
    }
}
