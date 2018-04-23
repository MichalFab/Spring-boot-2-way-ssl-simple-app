package com.client.app.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientAppApplication {
    static {
        System.setProperty("javax.net.debug", "all");
        System.setProperty("jdk.tls.client.protocols", "TLSv1.2");
        System.setProperty("https.protocols", "TLSv1.2");
        System.setProperty("javax.net.ssl.trustStore", "c://Users/Michal/Desktop/2-way sll//ClientApp.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "password");
        System.setProperty("javax.net.ssl.keyStore", "c://Users/Michal/Desktop/2-way sll//ClientApp.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "password");

        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
                (hostname, sslSession) -> {
                    return hostname.equals("localhost");
                });
    }

    @Bean
    public RestTemplate template() throws Exception {
        RestTemplate template = new RestTemplate();
        return template;
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientAppApplication.class, args);
    }
}
