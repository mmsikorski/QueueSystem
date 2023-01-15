package org.example.core.server;

public interface QueueServerFactory {

    void createNewServerInstance();
    void createNewServerInstance(QueueServerModel queueServerModel);
    void putServerIntoNewState(ServerState serverState);
    void stopServer();
    void startServer();
    void turnOffServer();

}
