package org.example.core.scheduler.job.model;

import org.example.core.scheduler.job.creator.JobLogic;

public class JobModelImpl implements JobModel {

    JobNames jobName;

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
}
