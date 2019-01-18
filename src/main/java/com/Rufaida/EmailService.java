package com.Rufaida;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    GreetingsService greetingsService;

    public EmailService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    String createRegistrationEmail() {
        return  greetingsService + "How do you like ReDi school";
    }
}
