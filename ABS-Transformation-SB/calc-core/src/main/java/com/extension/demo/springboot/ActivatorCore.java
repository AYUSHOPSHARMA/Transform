package com.extension.demo.springboot;

import java.util.Arrays;
import java.util.Hashtable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.extension.demo.springboot.api.CalculatorService;
import com.extension.demo.springboot.api.impl.AddService;

@SpringBootApplication
public class ActivatorCore  {

	/**
	 * 
	 */
	static ConfigurableApplicationContext appContext;

	 public static void setAppContext(ConfigurableApplicationContext appContext) {
		ActivatorCore.appContext = appContext;
	}



	public void start() throws Exception {}
	


	public static ConfigurableApplicationContext getAppContext() {
		return appContext;
	}

	public static void main(String[] args) {
		appContext = SpringApplication.run(ActivatorCore.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
			return null;

	}

	/*
	 * @Override public void stop(BundleContext context) throws Exception {
	 * bundleContext = null; SpringApplication.exit(appContext, () -> 0); }
	 * 
	 * public static BundleContext getBundleContext() { return bundleContext; }
	 */
	private void registerServices() {
		/*CalculatorService service = new AddService();
		bundleContext.registerService(CalculatorService.class.getName(), service, new Hashtable<String, Object>());
		System.out.println("Service registered: " + service.name()); */
	}

}
