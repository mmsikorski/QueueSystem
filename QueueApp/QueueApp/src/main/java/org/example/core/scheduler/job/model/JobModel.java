package org.example.core.scheduler.job.model;

public interface JobModel {

    void execute();
    void setAdditionalInfo(String info);
    String getAdditionalInfo();
    void setExecutionTimeFrequency();
    void setJobName(JobNames jobName);
    boolean getJobState();
    void setJobState(boolean jobState);

    JobNames getJobName();
    default JobModel getJobModel() { return this; }
    void logicToExecute();

}
