package com.example.greetings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("greetings")
public class GreetingsProperties {

    private final String salute;

    public GreetingsProperties(String salute) {
        this.salute = salute;
    }

    public String getSalute() {
        return salute;
    }
}
