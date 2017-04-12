package de.tfsw.cloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tfsw.spring.cloud.provider.ServiceProvider;

@RestController
public class AnotherController {

	// if ProviderClient is annotated with @FeignClient, then that's used.
	// otherwise, the manually created one from the library
	// ... well, I suppose that's how it works...
	@Autowired
	private ServiceProvider provider;
	
	@RequestMapping("/again")
	public String helloAgain() {
		return provider.hello();
	}
}
