package com.sample.gcp.controller;

import static com.sample.gcp.SampleGcpDemoApplication.PubSubOutboundGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author pradeepcg
 * @created 03/05/2023 - 11:08 AM
 */

@RestController
public class WebController {

    @Autowired
    private PubSubOutboundGateway messagingGateway;

    @PostMapping("/publishMessage")
    public RedirectView publishMessage(@RequestParam("message") String message) throws InterruptedException {
        messagingGateway.sendToPubSub(message);
        return new RedirectView("/");
    }
}
