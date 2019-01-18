package com.Rufaida;

import org.kohsuke.github.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Map;


public class App  {
    public static void main(String[] args) throws IOException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SatisfactionService satisfactionService = context.getBean(SatisfactionService.class);
        EmailService emailService = context.getBean(EmailService.class);

        GitHub gitHub = (GitHub) context.getBean("gitHub");
        GHOrganization rufi = gitHub.getOrganization("Redi-School");

        for (GHUser ghUser : rufi.getMembers()) {
               //System.out.println(ghUser);
                System.out.println(satisfactionService.SatisfactionService(ghUser,emailService));
            }

        }

    }


