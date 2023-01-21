package org.example.core.scheduler.job.model;

public class JobStorageFactoryImpl implements JobStorageFactory {

    static JobStorage jobStorage;

    //Singleton
    public JobStorageFactoryImpl() {

    }

    /**
     * @return
     */
    @Override
    public JobStorage createJobStorage() {

        if (jobStorage == null) {
            jobStorage =  new JobStorage();
        }

        return jobStorage;
    }


}
