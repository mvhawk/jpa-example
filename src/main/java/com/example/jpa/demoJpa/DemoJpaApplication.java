package com.example.jpa.demoJpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoJpaApplication.class);

	@Bean
	MyBean myBean() {
		return new MyBean();
	}

	public static void main(String[] args) {
		SpringApplication bootApp = new SpringApplication(DemoJpaApplication.class);
		ConfigurableApplicationContext context = bootApp.run(args);
		MyBean myBean = context.getBean(MyBean.class);
		myBean.doSomething();
	}

	private static class MyBean {

		@Value("${app.title}")
		private String appTitle;

		public void doSomething() {
			System.out.printf(appTitle);
		}
	}

}
