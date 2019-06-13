package com.tutorialspoint.RestReq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@RestController
@EnableScheduling
public class RestReqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestReqApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/products").allowedOrigins("http://localhost:8080");
			}
		};
		
	}
	
	@RequestMapping(value="/")
	public String hello(){
		 return "Hello World";
	 }
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	

}
