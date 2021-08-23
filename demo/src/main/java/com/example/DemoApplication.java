package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.FullName;
import com.example.model.SpringBootAppInfo;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runs on application start");
		System.out.println(SpringBootAppInfo.builder().courseName("SB").courseType("IT")
				.instrutorName(FullName.builder().firstName("Samarth").lastName("Narula").build()).build());
		System.out.println("random");
	}

}
