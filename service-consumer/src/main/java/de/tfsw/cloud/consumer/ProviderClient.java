package de.tfsw.cloud.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;

import de.tfsw.spring.cloud.provider.ServiceProvider;

// comment this out to see how the App relies on the manual Feign client from the library.
@FeignClient(name = "service-provider")
public interface ProviderClient extends ServiceProvider {

}
