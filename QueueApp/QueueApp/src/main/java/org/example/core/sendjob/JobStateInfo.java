package org.example.core.sendjob;

import org.springframework.stereotype.Component;

@Component
public class JobStateInfo {

    public String currentJobInfo;

    public String currentTask() {

        return currentJobInfo;
    }
}
