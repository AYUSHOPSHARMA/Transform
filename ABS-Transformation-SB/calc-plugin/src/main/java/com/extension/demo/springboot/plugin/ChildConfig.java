package com.extension.demo.springboot.plugin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.extension.demo.springboot.controller.ControllerConfig;

@Configuration
@ComponentScan("com.finalhints.*")
@EnableAutoConfiguration()
@Import(ControllerConfig.class)
public class ChildConfig {

}
