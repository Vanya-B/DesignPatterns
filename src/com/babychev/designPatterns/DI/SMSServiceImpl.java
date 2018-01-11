package com.babychev.designPatterns.DI;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS send to : " + rec + " with message: " + msg);
    }
}
