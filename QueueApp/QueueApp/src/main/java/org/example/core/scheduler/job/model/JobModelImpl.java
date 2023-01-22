package org.example.core.scheduler.job.model;

import org.example.core.scheduler.job.creator.JobLogic;

import java.util.concurrent.FutureTask;

public class JobModelImpl implements JobModel {

    JobNames jobName;
    private boolean jobState;
    private String info;
    LogicToExecute l;

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
        if (l != null) {
            logicToExecute(this.l);
        } else {
            logicToExecute();
        }
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
        System.out.println("Default Execution");
    }

    /**
     * @param l
     */
    @Override
    public void setLogicToExecute(LogicToExecute l) {
        this.l = l;
    }

    /**
     * @param l
     */
    @Override
    public void logicToExecute(LogicToExecute l) {
        l.logicToExecute();
    }
}
