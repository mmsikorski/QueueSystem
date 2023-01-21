package org.example.core.scheduler;

import org.example.core.scheduler.job.model.JobModel;

public interface ScheduledJobExecutor {

    public void executeSchedulerJob(JobModel jobModel);

}
