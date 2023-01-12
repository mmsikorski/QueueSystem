package org.example.storage.topic;

public interface TopicFactory {

    TopicModel createTopicModel();

    TopicModel createTopicModel(TopicModel topicModel);
}
