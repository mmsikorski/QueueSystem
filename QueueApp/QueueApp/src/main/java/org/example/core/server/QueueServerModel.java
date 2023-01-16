package org.example.core.server;

import java.util.Map;

public interface QueueServerModel {

    QueueServerModelBuilder builder();

    <T extends ServerParameters<? extends Object>> Map<String, ServerParameters<T>> getParams();
}
