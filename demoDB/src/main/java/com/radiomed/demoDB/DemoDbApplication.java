package com.radiomed.demoDB;

import com.radiomed.demoDB.JwtFilter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoDbApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoDbApplication.class, args);
	}// main

	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean =
				new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/admin/");
		return registrationBean;
	}	//jwtFilter

}//DemoDbApplication
