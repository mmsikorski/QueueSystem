package org.example.core.scheduler.job.model;

public interface JobModel {

    void execute();

    void setExecutionTimeFrequency();
    void setJobName(JobNames jobName);
    boolean getJobState();
    void setJobState(boolean jobState);

    JobNames getJobName();
    void logicToExecute();
    void logicToExecute(LogicToExecute l);
    void setLogicToExecute(LogicToExecute l);

    void setAdditionalInfo(String info);
    String getAdditionalInfo();

    default JobModel getJobModel() {
        return this;
    }


}
