package org.example.core.server;

public abstract class ServerParameters<T> {

    public abstract void setParam(T param);
    public abstract T getParam();

}
