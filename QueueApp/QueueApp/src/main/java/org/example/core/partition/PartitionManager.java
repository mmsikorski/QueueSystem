package org.example.core.partition;

public interface PartitionManager {

    public void choosePartition();

    public void setNewPartitionIdCreator(PartitionIdCreatorStrategy partitionCreator);

    public void setPartitionId(int id);

    public int getPartitionId();
}
