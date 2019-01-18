package com.Rufaida;

import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    GitHub gitHub () throws IOException {
        return GitHub.connectAnonymously();
    }

   /* @Bean
    GreetingsService greetingsService(){
        return new GreetingsService();
    }

    @Bean
    EmailService emailService(GreetingsService greetingsService){
         return new EmailService(greetingsService);
    }
    @Bean
    SatisfactionService satisfactionService(GHUser ghUser, EmailService emailService){
        return new SatisfactionService(ghUser,emailService);
    }*/

}
