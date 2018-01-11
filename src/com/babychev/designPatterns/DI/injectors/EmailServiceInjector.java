package com.babychev.designPatterns.DI.injectors;

import com.babychev.designPatterns.DI.components.EmailServiceImpl;
import com.babychev.designPatterns.DI.consumer.Consumer;
import com.babychev.designPatterns.DI.consumer.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}
