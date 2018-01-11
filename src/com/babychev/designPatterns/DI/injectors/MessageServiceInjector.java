package com.babychev.designPatterns.DI.injectors;

import com.babychev.designPatterns.DI.consumer.Consumer;

public interface MessageServiceInjector {

    Consumer getConsumer ();
}
