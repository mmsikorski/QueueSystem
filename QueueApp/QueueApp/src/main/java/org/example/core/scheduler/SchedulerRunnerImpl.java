package org.example.core.scheduler;

public class SchedulerRunnerImpl implements SchedulerRunner {

    SchedulerMainSpec schedulerMainSpec;

    public SchedulerRunnerImpl() {
        schedulerMainSpec = new SchedulerMainSpecImpl();
    }

    /**
     *
     */
    @Override
    public void runScheduler() {
        Thread thread = new Thread(schedulerMainSpec);
        thread.start();
    }
}
