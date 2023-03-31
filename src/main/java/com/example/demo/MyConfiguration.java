package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy //her yere uygula
public class MyConfiguration {
	public MyConfiguration() {
		System.out.println("My Configuration initialized!");
	}
	
	@Bean
	@Lazy
	public Example1 getExemple1() {
		return new Example1();
	}
	//Böyle yöntemlere tek tek yazılacağı gibi class düzeyinde yapılırsa içerisinde bulunan her method'a tatbik etmiş olacak!
	@Bean
	@Lazy
	public Example2 getExemple2() {
		return new Example2();
	}
}
