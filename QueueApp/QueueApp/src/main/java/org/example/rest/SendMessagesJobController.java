package org.example.rest;

import org.example.core.sendjob.JobStateInfo;
import org.example.core.sendjob.SendJobRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/job")
@RestController
public class SendMessagesJobController {

    SendJobRunner sendJobRunner;
    JobStateInfo jobStateInfo;

    Thread t1;

    @Autowired
    public SendMessagesJobController(SendJobRunner sendJobRunner, JobStateInfo jobStateInfo) {
        this.sendJobRunner = sendJobRunner;
        this.jobStateInfo = jobStateInfo;
    }

    @RequestMapping("/start")
    String startSending() {
        sendJobRunner.turnOnSendingMessages();
        t1 = new Thread(sendJobRunner);
        t1.start();

        return "Sending to subs is turned on.";
    }

    @RequestMapping("/end")
    String turnOffSending() {
        sendJobRunner.turnOffSendingMessages();
        t1.interrupt();
        return "Sending to subs is turned off";
    }

    @GetMapping("/currentjob")
    String currentJobInfo() {
        String currentJobInfo = jobStateInfo.currentTask();

        return currentJobInfo;
    }
}
