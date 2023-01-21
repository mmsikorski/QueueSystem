package org.example.core.scheduler;

import org.example.core.scheduler.job.model.JobStorage;
import org.example.core.scheduler.job.model.JobStorageFactoryImpl;

public class MainSchedulerRunnerImpl implements MainSchedulerRunner {

    JobStorage jobStorage;
    ScheduledJobExecutor scheduledJobExecutor;


    void initSchedulerRunner() {
        this.jobStorage = new JobStorageFactoryImpl().createJobStorage();
    }

    /**
     *
     */
    @Override
    public void run() {

        initSchedulerRunner();

        while(true) {

        }

    }
}
