package com.supers.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.supers.basic"})
public class BasicApplication {

	public static void main(String[] args) {
			SpringApplication.run(BasicApplication.class, args);
	}
}
