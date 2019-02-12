package com.joby.demojoby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojobyApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemojobyApplication.class, args);
		Timer timer = new Timer();
		timer.log();
	}

}

