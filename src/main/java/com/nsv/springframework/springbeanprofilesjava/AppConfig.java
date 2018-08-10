package com.nsv.springframework.springbeanprofilesjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = {"com.nsv.springframework.springbeanprofilesjava"})
public class AppConfig {
    @Autowired
    private Environment environment;
}
