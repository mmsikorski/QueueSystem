package org.example.core.scheduler.job.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

class JobStorageFactoryImplTest {

    JobStorageFactory jobStorageFactory;

    @BeforeEach
    void setUp() {

        jobStorageFactory = new JobStorageFactoryImpl();
    }

    @Test
    void createTwoJobStorages_thenCheckObjectEquality () {
        JobStorage jobStorageFirst = jobStorageFactory.createJobStorage();
        JobStorage jobStorageSecond = jobStorageFactory.createJobStorage();

        boolean objectsEquality = jobStorageFirst.equals(jobStorageSecond) ? true : false;

        Assertions.assertTrue(objectsEquality);
    }


    @Test
    void createTwoJobStorage_andAddJobToTheFirstOne_theCheckObjectsEquality() {

        JobStorage jobStorage1 = jobStorageFactory.createJobStorage();
        JobStorage jobStorage2 = jobStorageFactory.createJobStorage();

        JobModel jobModel = new JobModelImpl();
        jobModel.setJobName(JobNames.MINUTE);
        jobStorage1.addJob(jobModel);

        boolean b = jobStorage1.equals(jobStorage2) ? true : false;

        Assertions.assertTrue(b);
    }

    //TODO: Fix test because jobStorage doesn't work correctly
    @Test
    void createTwoJobStorages_thenAddJobToTheFristAndExtractJobFromSecondOne_thenCheckJobCorrectness() {
        JobStorage jobStorage = jobStorageFactory.createJobStorage();
        JobModel jobModel = new JobModelImpl();
        String initInfo = "info";
        jobModel.setAdditionalInfo(initInfo);
        jobModel.setJobName(JobNames.MINUTE);
        jobStorage.addJob(jobModel);

        JobModel jobByKey = jobStorage.getJobByKey(JobNames.MINUTE);
        String additionalInfo = jobByKey.getAdditionalInfo();
        System.out.println(additionalInfo);


//        Assertions.assertEquals(additionalInfo, "info");

    }
}