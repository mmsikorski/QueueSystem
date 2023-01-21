package org.example.core.scheduler.job.model;

public class JobStorageFactoryImpl implements JobStorageFactory {

    static JobStorage jobStorage;

    //Singleton
    public JobStorageFactoryImpl() {
        jobStorage = new JobStorage();
    }

    /**
     * @return
     */
    @Override
    public JobStorage createJobStorage() {

        JobStorage jobStorage = new JobStorage();
        if (JobStorageFactoryImpl.jobStorage == null) {
            JobStorageFactoryImpl.jobStorage = jobStorage;
        } else {
            return JobStorageFactoryImpl.jobStorage;

        }
        return JobStorageFactoryImpl.jobStorage;

    }


}
