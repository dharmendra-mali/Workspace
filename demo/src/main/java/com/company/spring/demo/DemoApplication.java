package com.company.spring.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableDiscoveryClient
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.setBanner(null);
		application.run(args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
