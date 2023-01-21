package org.example.core.scheduler.job.model;

public class JobStorageFactoryImpl implements JobStorageFactory {
    /**
     * @return
     */
    @Override
    public JobStorage createJobStorage() {
        return new JobStorage();
    }
}
