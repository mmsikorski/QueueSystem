package org.example.core.sendjob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobStateInfo {

    SendJobState sendJobState;

    @Autowired
    public JobStateInfo(SendJobState sendJobState) {
        this.sendJobState = sendJobState;
    }

    public String currentJobInfo;

    public String currentTask() {
        if(sendJobState.jobCurrentStateBoolean() == false) {
            return "Sending messages is turned off";
        }
        return currentJobInfo;
    }
}
