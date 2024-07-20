package ru.gb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    // Inversion Of Control
    // @Autowired Field Injection
    private final EmailServerParameters parameters;

    // Если конструктор один - то @Autowired необязательна, если несколько - то ТОЛЬКО над одним конструктором
    // @Autowired // Constructor injection - Dependency Injection
    public EmailSender(EmailServerParameters parameters) {
        this.parameters = parameters;
    }

/*
     public EmailSender() {
         System.out.println("EMAIL SENDER CREATED"); // это покажет количество созданных объектов
     }
*/

    public void sendEmail(String subject, String body, String recipient) {
        System.out.println("Письмо [" + subject + "] отправлено получателю (" + recipient + ")");
        System.out.println("Адрес smtp: " + parameters.getEmailServerAddress());
    }
}
