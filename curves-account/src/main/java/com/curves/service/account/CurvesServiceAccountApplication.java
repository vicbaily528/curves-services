package com.curves.service.account;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author vic
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CurvesServiceAccountApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CurvesServiceAccountApplication.class);
        application.run(args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
