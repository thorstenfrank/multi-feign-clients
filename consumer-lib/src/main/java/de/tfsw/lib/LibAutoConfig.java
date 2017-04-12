package de.tfsw.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.tfsw.spring.cloud.provider.ServiceProvider;
import feign.Client;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.hystrix.HystrixFeign;

@Configuration
@Import(FeignClientsConfiguration.class)
public class LibAutoConfig {

	private static final Logger LOG = LoggerFactory.getLogger(LibAutoConfig.class);
	
	@Bean
	@ConditionalOnMissingBean(ServiceProvider.class)
	public ServiceProvider serviceProvider(Client client, Encoder encoder, Decoder decoder) {
		LOG.info("No ServiceProvider found, creating manual Feign client");
		return HystrixFeign.builder()
				.client(client)
				.encoder(encoder)
				.decoder(decoder)
				.contract(new SpringMvcContract())
				.target(ServiceProvider.class, "http://service-provider"); 
	}
	
	@Bean
	public DelegateHelloWorldController delegateHelloWorldController(ServiceProvider serviceProvider) {
		return new DelegateHelloWorldController(serviceProvider);
	}
}
