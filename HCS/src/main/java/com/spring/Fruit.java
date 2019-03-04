package com.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Fruit {

@Bean
public Apple apple() {
	return new Apple();
}

}
