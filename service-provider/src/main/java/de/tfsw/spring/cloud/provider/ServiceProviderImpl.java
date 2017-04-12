package de.tfsw.spring.cloud.provider;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderImpl implements ServiceProvider {

	@Override
	public String hello() {
		return "Hello, World!";
	}

}
