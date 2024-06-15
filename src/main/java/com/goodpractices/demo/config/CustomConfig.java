package com.goodpractices.demo.config;

import com.goodpractices.demo.data.entity.WhateverEntity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    public WhateverEntity whateverEntity() {
        return new WhateverEntity();
    }

}
