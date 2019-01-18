package com.Rufaida;

import org.springframework.stereotype.Component;

@Component
public class GreetingsService {
    public String greet(String name){
        return "Hallo" +name;

    }
}
