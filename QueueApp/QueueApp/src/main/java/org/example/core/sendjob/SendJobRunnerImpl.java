package org.example.core.sendjob;

import org.example.sender.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

/**
 * Refactor this code quickly. We should separate RunnerJob, StateJob and Creating job that will be activated in thread/
 */
@Component
public class SendJobRunnerImpl implements SendJobRunner{

    SendJobState sendJobState;
    JobStateInfo jobStateInfo;

    SendMessageService sendMessageService;

    @Autowired
    public SendJobRunnerImpl(SendJobState sendJobState, JobStateInfo jobStateInfo, SendMessageService sendMessageService) {
        this.sendJobState = sendJobState;
        this.jobStateInfo = jobStateInfo;
        this.sendMessageService = sendMessageService;
    }

    @Override
    public void turnOnSendingMessages() {
        sendJobState.setJobRunnerState(true);


        boolean b = sendJobState.jobCurrentStateBoolean();


        if(b) {
            //TODO: to refactor
        }

    }

    @Override
    public void turnOffSendingMessages() {
        sendJobState.setJobRunnerState(false);
    }
    @Override
    public void run() {
        while(true) {
            sendMessageService.sendMessagesToSubs();
        }
//        while(true) {
//            Random random = new Random();
//            int i = random.nextInt();
//            jobStateInfo.currentJobInfo = new StringBuilder().append(i).toString();
//        }
    }
}
