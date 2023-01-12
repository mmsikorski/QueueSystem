package org.example.storage.topic.info;

import java.util.List;

public interface TopicInfo {

    List<Integer> getPartitions();

    List<Integer> getStorageIds();

}
