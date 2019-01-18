package com.Rufaida;

import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Component;

@Component
public class SatisfactionService {

    GHUser gitHub;
    EmailService emailService;

    public SatisfactionService(GHUser gitHub, EmailService emailService) {
        this.gitHub = gitHub;
        this.emailService = emailService;
    }

    public SatisfactionService SatisfactionService(GHUser gitHub, EmailService emailService){
        return   new SatisfactionService(gitHub ,emailService);
    }
}
