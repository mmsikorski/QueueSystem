package org.example.storage.topic;

import org.example.storage.topic.info.TopicInfo;
import org.example.storage.topic.info.TopicInfoImpl;

import java.util.List;

public class TopicModelImpl implements TopicModel {

    TopicInfo topicInfo;

    public TopicModelImpl() {
        topicInfo = new TopicInfoImpl();
    }

    public String topicName;
    public List<Integer> partitionsConnectedToTopic;

    @Override
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public TopicInfo getAllTopicInfo() {

        return topicInfo;
    }

}
