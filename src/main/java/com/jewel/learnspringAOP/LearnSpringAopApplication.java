package com.jewel.learnspringAOP;

import com.jewel.learnspringAOP.AOPExamples.Bussines.BussinesService1;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

	private Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	private BussinesService1 bussinesService1;

	//constructor injection
	public LearnSpringAopApplication(BussinesService1 bussinesService1) {
		this.bussinesService1 = bussinesService1;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("value return is {}",bussinesService1.calculateMax()); //remind slf4j.Logger
	}
}
