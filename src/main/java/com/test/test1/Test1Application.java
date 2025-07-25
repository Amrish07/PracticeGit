package com.test.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	int z = 100;

	String name = "mike";
	int x = 100;
	boolean isPresent = false;
	int y = 200;
	boolean isSub = true;
	bolean flag = true;

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
