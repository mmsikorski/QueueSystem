package org.example.storage.topic.info;

import java.util.List;

public class TopicInfoImpl implements TopicInfo {

    public Integer id;

    public TopicInfoImpl(Integer id) {
        this.id = id;
    }

    //TODO: Refactor, ID should be somewhat related to Message and topic ID and storage ID.
    public TopicInfoImpl() {
        this(null);
    }

    /**
     * @return
     */
    @Override
    public List<Integer> getPartitions() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Integer> getStorageIds() {
        return null;
    }
}
