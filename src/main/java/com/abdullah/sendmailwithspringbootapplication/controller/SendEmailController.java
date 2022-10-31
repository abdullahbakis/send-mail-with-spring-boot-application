package com.abdullah.sendmailwithspringbootapplication.controller;

import com.abdullah.sendmailwithspringbootapplication.SendMailWithSpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;

@RestController
public class SendEmailController {

    @Autowired
    SendMailWithSpringBootApplication sendMailWithSpringBootApplication;

    @RequestMapping(value = "/sendemail")
    public String send() throws AddressException, MessagingException, IOException {
        //sendEmail();
        sendMailWithSpringBootApplication.sendEmail();
        return "Email sent successfully";
    }
}