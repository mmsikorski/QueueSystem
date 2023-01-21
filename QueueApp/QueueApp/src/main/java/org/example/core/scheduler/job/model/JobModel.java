package org.example.core.scheduler.job.model;

import org.example.core.scheduler.job.creator.JobLogic;

public interface JobModel {

    void execute();
    void setExecutionTimeFrequency();
    void setJobName(JobNames jobName);

    JobNames getJobName();
    default JobModel getJobModel() { return this; }


}
