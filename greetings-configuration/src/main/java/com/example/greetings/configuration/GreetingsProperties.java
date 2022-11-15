package com.example.greetings.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@ConfigurationProperties("greetings")
public class GreetingsProperties {

    private final String salute;

    @ConstructorBinding
    public GreetingsProperties(String salute) {
        this.salute = salute;
    }

    public String getSalute() {
        return salute;
    }
}
