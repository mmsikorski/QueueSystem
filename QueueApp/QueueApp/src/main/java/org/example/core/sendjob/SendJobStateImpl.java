package org.example.core.sendjob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendJobStateImpl implements SendJobState{

    public boolean jobSwitcher = false;

    @Override
    public String jobCurrentState() {
        String s = jobSwitcher ? "Messages sending process is turn on" : "Messages sending process is turned off";
        return s;
    }

    @Override
    public void setJobRunnerState(boolean jobSwitcher) {
        this.jobSwitcher = jobSwitcher;
    }

    @Override
    public boolean jobCurrentStateBoolean() {
        return jobSwitcher;
    }

}
