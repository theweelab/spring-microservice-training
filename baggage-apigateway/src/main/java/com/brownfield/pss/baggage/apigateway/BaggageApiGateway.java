package com.brownfield.pss.baggage.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2 
public class BaggageApiGateway implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(BaggageApiGateway.class);

	public static void main(String[] args) {
		SpringApplication.run(BaggageApiGateway.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		logger.info("Service initialized successfully.");
	}
}
