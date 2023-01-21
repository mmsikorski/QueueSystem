package org.example.core.server;

import java.util.Map;

public interface QueueServerModel {

    QueueServerModelBuilder builder();

    <T extends ServerParameters<?>> Map<String, ServerParameters<T>> getParams();
}
