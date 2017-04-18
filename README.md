# multi-feign-clients
Spring Cloud Netflix example of re-using/creating feign clients

This repo is a sample created for issue https://github.com/spring-cloud/spring-cloud-netflix/issues/1852

## Contents

* *service-provider* is a Spring Boot app with a simple hello world REST interface
* *consumer-lib*: library with a dependency to the provider and a RestController automatically created via AutoConfiguration. This controller simply delegates to the `service-provider`
* *service-consumer*: App that uses both the lib and the provider directly.
* *unaware-consumer*: no direct dependencies to the provider, only indirectly through the library, including the REST controller from there

## Running

You will need to have Eureka running - I'm using port 8761. Adapt the application.yml of each app accordingly if you're using a different one.
