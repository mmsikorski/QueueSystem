package org.example.core.scheduler.job.model;

import org.example.core.scheduler.job.creator.JobLogic;

import java.util.concurrent.FutureTask;

public class JobModelImpl implements JobModel {

    JobNames jobName;
    private boolean jobState;
    private String info;


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
    logicToExecute();
    }

    @Override
    public void setAdditionalInfo(String info) {
        this.info = info;
    }

    @Override
    public String getAdditionalInfo() {
        return this.info;
    }


    /**
     * @return
     */
    @Override
    public JobNames getJobName() {
        return jobName;
    }

    @Override
    public void logicToExecute() {
        System.out.println("Execution");
    }
}
