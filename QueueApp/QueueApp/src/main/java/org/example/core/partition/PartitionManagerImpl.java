package org.example.core.partition;

import org.example.core.partition.generator.PartitionStandardIdCreatorStrategyImpl;

public class PartitionManagerImpl implements PartitionManager {

    PartitionIdCreatorStrategy partitionIdCreatorStrategy;
    int partitionId;

    public PartitionManagerImpl(PartitionIdCreatorStrategy partitionIdCreatorStrategy) {
        this.partitionIdCreatorStrategy = new PartitionStandardIdCreatorStrategyImpl();
    }

    @Override
    public void setNewPartitionIdCreator(PartitionIdCreatorStrategy partitionCreator) {
        this.partitionIdCreatorStrategy = partitionCreator;
    }

    @Override
    public void setPartitionId(int id) {
        partitionId = id;
    }

    @Override
    public int getPartitionId() {
        return partitionId;
    }

    @Override
    public void choosePartition() {
        partitionId = partitionIdCreatorStrategy.generatePartitionId();
    }
}
