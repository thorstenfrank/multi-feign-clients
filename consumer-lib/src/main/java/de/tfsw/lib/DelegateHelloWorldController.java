package de.tfsw.lib;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tfsw.spring.cloud.provider.ServiceProvider;

@RestController
public class DelegateHelloWorldController {

	private ServiceProvider provider;

	public DelegateHelloWorldController(ServiceProvider provider) {
		super();
		this.provider = provider;
	}

	@RequestMapping("/")
	public String hello() {
		return provider.hello();
	}
}
