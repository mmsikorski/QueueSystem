package org.example.core.server;

import com.sun.net.httpserver.HttpServer;

public class QueueServerFactoryImpl implements QueueServerFactory {
    /**
     *
     */
    @Override
    public void createNewServerInstance() {
        QueueServerModel server = new QueueServerModelImpl().builder()
                .setServerName("Mockup server")
                .build();
    }

    /**
     * @param queueServerModel
     */
    @Override
    public void createNewServerInstance(QueueServerModel queueServerModel) {

    }

    /**
     * @param serverState
     */
    @Override
    public void putServerIntoNewState(ServerState serverState) {

    }

    /**
     *
     */
    @Override
    public void stopServer() {

    }

    /**
     *
     */
    @Override
    public void startServer() {

    }

    /**
     *
     */
    @Override
    public void turnOffServer() {

    }
}
