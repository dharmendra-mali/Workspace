package com.java.CallUserApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients("com.java.CallUserApi")
public class CallUserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallUserApiApplication.class, args);
	}

}
