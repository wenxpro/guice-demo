package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        // 表明：当需要 Communicator 这个变量时，我们注入 DefaultCommunicatorImpl 的实例作为依赖
//        bind(Communicator.class).to(DefaultCommunicatorImpl.class);
//
//        bind(Communication.class)
//                .toInstance(new Communication(true));
    }

    @Provides
    @Singleton
    public Communicator getCommunicator() {
        return new DefaultCommunicatorImpl();
    }
}