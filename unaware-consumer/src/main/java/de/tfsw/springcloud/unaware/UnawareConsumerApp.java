package de.tfsw.springcloud.unaware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UnawareConsumerApp {
	
	public static void main(String[] args) {
		SpringApplication.run(UnawareConsumerApp.class, args);
	}
}
