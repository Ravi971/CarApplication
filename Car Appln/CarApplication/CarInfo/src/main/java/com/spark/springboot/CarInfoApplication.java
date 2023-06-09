package com.spark.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class CarInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarInfoApplication.class, args);
	}

}
