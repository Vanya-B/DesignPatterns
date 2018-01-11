package com.babychev.designPatterns.DI;

public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication (MessageService srv) {
        this.service = srv;
    }

    @Override
    public void processMessages(String msg, String rec) {
        service.sendMessage(msg, rec);
    }
}
