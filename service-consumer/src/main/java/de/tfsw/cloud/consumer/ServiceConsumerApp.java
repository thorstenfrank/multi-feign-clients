package de.tfsw.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@Import(FeignClientsConfiguration.class)
public class ServiceConsumerApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerApp.class, args);
	}
}
