package com.babychev.designPatterns.DI;

import com.babychev.designPatterns.DI.consumer.Consumer;
import com.babychev.designPatterns.DI.injectors.EmailServiceInjector;
import com.babychev.designPatterns.DI.injectors.MessageServiceInjector;
import com.babychev.designPatterns.DI.injectors.SMSServiceInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "some message";
        String rec = "John";
        String phone = "0654833";

        MessageServiceInjector injector;
        Consumer app;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, rec);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
