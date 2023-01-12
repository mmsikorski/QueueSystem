package org.example.storage.topic;

public class TopicFactoryImpl implements TopicFactory {
    /**
     * @return
     */
    @Override
    public TopicModel createTopicModel() {

        return new TopicModelImpl();
    }

    @Override
    public TopicModel createTopicModel(TopicModel topicModel) {
        return topicModel;
    }


}
