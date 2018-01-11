package com.babychev.designPatterns.DI.injectors;

import com.babychev.designPatterns.DI.components.SMSServiceImpl;
import com.babychev.designPatterns.DI.consumer.Consumer;
import com.babychev.designPatterns.DI.consumer.MyDIApplication;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
