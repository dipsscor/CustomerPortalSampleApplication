package com.customermanagement.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DistributedTracingConfiguration {
	
	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}

}
