package org.example.core.scheduler;

import org.example.core.scheduler.job.model.JobModel;
import org.example.core.scheduler.job.model.JobNames;

public class ScheduledJobExecutorImpl implements ScheduledJobExecutor {
    /**
     *
     */
    @Override
    public void executeSchedulerJob(JobModel jobModel) {
        jobModel.execute();
    }
}
