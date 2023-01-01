package org.example.core.sendjob;

public interface SendJobState {

    public String jobCurrentState();

    public boolean jobCurrentStateBoolean();

    public void setJobRunnerState(boolean b);

}
