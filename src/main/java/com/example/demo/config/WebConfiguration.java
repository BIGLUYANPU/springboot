package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import java.util.List;


@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler(Swagger2Constants.swaggerUri.split(","))
//                .addResourceLocations(Swagger2Constants.swaggerLocation.split(","));
//    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new UnderlineToCamelArgumentResolver());
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}