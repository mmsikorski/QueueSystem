package org.example.core.server.params;

import org.example.core.server.ServerParameters;

public class ServerNameParam extends ServerParameters<String> {

    String serverName;
    /**
     * @param param
     */
    @Override
    public void setParam(String param) {
        this.serverName = param;
    }

    /**
     * @return
     */
    @Override
    public String getParam() {
        return serverName;
    }
}
