package org.example.core.scheduler;

import org.example.core.scheduler.job.model.JobStorage;
import org.example.core.scheduler.job.model.JobStorageFactoryImpl;

public class SchedulerMainSpecImpl implements SchedulerMainSpec {

    JobStorage jobStorage;
    ScheduledJobExecutor scheduledJobExecutor;


    void initSchedulerRunner() {
        this.jobStorage = new JobStorageFactoryImpl().createJobStorage();
        this.scheduledJobExecutor = new ScheduledJobExecutorImpl();
    }
    
    /**
     *
     */
    @Override
    public void run() {

        initSchedulerRunner();

            jobStorage.getJobStorage().forEach((x, y) -> {
                y.execute();
            });


    }
}
