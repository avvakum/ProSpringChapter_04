package com.avva.four.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

class ShutdownHookBean implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        if (context instanceof GenericApplicationContext) {
            ((GenericApplicationContext) context).registerShutdownHook();
        }

    }
}
