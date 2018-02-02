package com.fluig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class OAuth2ResourceServer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OAuth2ResourceServer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceServer.class, args);
    }
}
