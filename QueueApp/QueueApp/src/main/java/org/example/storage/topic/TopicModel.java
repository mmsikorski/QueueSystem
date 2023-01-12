package org.example.storage.topic;

import org.example.storage.topic.info.TopicInfo;

public interface TopicModel {

    void setTopicName(String topicName);

    public TopicInfo getAllTopicInfo();
}
