package org.example.core.scheduler.job.model;

import org.example.core.scheduler.job.creator.JobLogic;

public class JobModelImpl implements JobModel {

    JobNames jobName;
    private boolean jobState;


    /**
     *
     */
    @Override
    public void setExecutionTimeFrequency() {

    }

    /**
     * @param jobName
     */
    @Override
    public void setJobName(JobNames jobName) {
        this.jobName = jobName;
    }

    /**
     * @return
     */
    @Override
    public boolean getJobState() {
       return jobState;
    }

    @Override
    public void setJobState(boolean jobState) {
        this.jobState = jobState;
    }

    /**
     * @param
     */
    @Override
    public void execute() {

    }

    /**
     * @return
     */
    @Override
    public JobNames getJobName() {
        return null;
    }

    @Override
    public void logicToExecute() {
        System.out.println("Execution");
    }
}
