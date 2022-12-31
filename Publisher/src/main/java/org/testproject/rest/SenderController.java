package org.testproject.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testproject.http.HttpService;

@RequestMapping("/send")
@RestController
public class SenderController {
    static int messageNumber = 0;

    HttpService httpService;

    @Autowired
    public SenderController(HttpService httpService) {
        this.httpService = httpService;
    }

    @GetMapping("message")
    String sendValue() {
        messageNumber += 1;
        String s = new StringBuilder().append(messageNumber).toString();
        httpService.toQueueGetRequest(s);
        return new StringBuilder("Message number ").append(s).toString();
    }

}
