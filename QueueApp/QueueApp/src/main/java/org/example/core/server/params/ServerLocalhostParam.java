package org.example.core.server.params;

import org.example.core.server.ServerParameters;

public class ServerLocalhostParam extends ServerParameters<String> {

    String localhost;

    /**
     * @param param
     */
    @Override
    public void setParam(String param) {
        this.localhost = param;
    }

    @Override
    public String getParam() {
        return localhost;
    }
}
