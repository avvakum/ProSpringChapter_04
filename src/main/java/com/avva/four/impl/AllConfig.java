package com.avva.four.impl;

import com.avva.four.impl.provider.ConfigurableMessageProvider;
import com.avva.four.impl.renderer.StandardOutMessageRenderer;
import com.zpack.decoupled.MessageProvider;
import com.zpack.decoupled.MessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AllConfig {

    @Profile("dev")
    @Bean
    MessageProvider messageProvider() {
        return new ConfigurableMessageProvider("Text Sample @Profile('dev')");
    }

    @Bean
    MessageRenderer messageRenderer() {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider());
        return messageRenderer;
    }
}
