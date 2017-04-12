package de.tfsw.spring.cloud.provider;

import org.springframework.web.bind.annotation.RequestMapping;

public interface ServiceProvider {

	@RequestMapping("/")
	String hello();
}
