package org.example.core.server;

import org.example.core.server.params.ServerLocalhostParam;

import java.util.HashMap;
import java.util.Map;

 class QueueServerModelImpl implements QueueServerModel {

    String serverName;
    String serverAddress;
    Integer port;

    public QueueServerModelImpl(QueueServerModelBuilderImpl builder) {
        this.serverName = builder.getServerName();
        this.serverAddress = builder.getServerAddress();
        this.port = builder.getServerPort();
    }

    public QueueServerModelImpl() {

    }

    @Override
    public QueueServerModelBuilder builder() {
        return new QueueServerModelBuilderImpl();
    }

    @Override
    public Map<String, ServerParameters> getParams() {
        HashMap<String, ServerParameters> serverParams = new HashMap<>();

//        serverParams.put("serverName", ServerNameParamObject)

        return serverParams;
    }


}
