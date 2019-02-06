package com.fileDemo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.example.filedemo.property.FileStorageProperties;

@EnableConfigurationProperties({
    FileStorageProperties.class
})
@SpringBootApplication
@ComponentScan(basePackages= {"com.example.filedemo.exception",
		                      "com.example.filedemo.controller",
		                      "com.example.filedemo.payload",
		                      "com.example.filedemo.service",
		                      "com.example.filedemo.property"}
)
public class FileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDemoApplication.class, args);
	}

}

