package com.client.app.clientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpClient implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        ResponseEntity<String> response = template.getForEntity("https://localhost:8443/server/hello",
                String.class);
        System.out.println(response.getBody());
    }

}
