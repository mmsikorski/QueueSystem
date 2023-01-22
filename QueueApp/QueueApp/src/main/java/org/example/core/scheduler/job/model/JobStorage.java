package org.example.core.scheduler.job.model;

import java.util.HashMap;
import java.util.Map;

public final class JobStorage {

    static Map<JobNames, JobModel> jobStorage = new HashMap<>();

    public void putJob(JobModel jobModel) {
        jobStorage.put(jobModel.getJobName(), jobModel);
    }

    public Map<JobNames, JobModel> getJobStorage() {
        return jobStorage;
    }

    public JobModel getJobByKey(JobNames jobNames) { return jobStorage.get(jobNames); }

}
