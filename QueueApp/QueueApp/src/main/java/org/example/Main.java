package org.example;

import org.example.core.scheduler.SchedulerRunner;
import org.example.core.scheduler.SchedulerRunnerImpl;
import org.example.core.scheduler.job.model.*;
import org.example.storage.Message;
import org.example.storage.MessageStorage;
import org.example.storage.Storage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SchedulerRunner scheduler = new SchedulerRunnerImpl();

        JobStorage jobStorage = new JobStorageFactoryImpl().createJobStorage();
        JobModelImpl jobModel = new JobModelImpl();
        LogicToExecute l = () -> {
            Timer timer = new Timer(true);

            timer.schedule(
                    new TimerTask() {
                        @Override
                        public void run() {
                            System.out.println("Test task each 5 seconds");
                        }
                    }, 0, 5000);
        };

        jobModel.setLogicToExecute(l);
        jobModel.setJobName(JobNames.MINUTE);

        JobModel model = new JobModelImpl();

        LogicToExecute ll = () -> {
            Timer timer = new Timer(true);

            timer.schedule(
                    new TimerTask() {
                        @Override
                        public void run() {
                            System.out.println("Test task each second");
                        }
                    }, 0, 1000);
        };
        model.setLogicToExecute(ll);
        model.setJobName(JobNames.TEN_MINUTES);
        jobStorage.putJob(model);

        jobStorage.putJob(jobModel);

        scheduler.runScheduler();

            while(true) {

            }
    }
}