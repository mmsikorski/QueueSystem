package org.example.core.scheduler.job.model;

import org.example.core.scheduler.job.creator.JobLogic;

public interface JobModel {

    void execute();
    void setExecutionTimeFrequency();
    void setJobName(JobNames jobName);
    boolean getJobState();
    void setJobState(boolean jobState);

    JobNames getJobName();
    default JobModel getJobModel() { return this; }
    void logicToExecute();

}
