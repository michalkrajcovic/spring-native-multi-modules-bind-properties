package com.example.greetings.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greetings")
public class GreetingsProperties {

    private String salute;

    public String getSalute() {
        return salute;
    }

    public void setSalute(String salute) {
        this.salute = salute;
    }
}
