package org.example.core.server.params;

import org.example.core.server.ServerParameters;

public class ServerPortParam extends ServerParameters<Integer> {

    Integer port;

    /**
     * @param param
     */
    @Override
    public void setParam(Integer param) {
        this.port = param;
    }

    /**
     * @return
     */
    @Override
    public Integer getParam() {
        return this.port;
    }
}
