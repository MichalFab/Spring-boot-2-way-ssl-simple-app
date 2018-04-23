package com.server.app.serverapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerHomeController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello from secured server! :) ";
    }
}
