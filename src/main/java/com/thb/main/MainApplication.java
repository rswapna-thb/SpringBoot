package com.thb.main;
import com.thb.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import  org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages={"com.thb.model"})
@SpringBootApplication(scanBasePackages={
"com.thb.*"})
@EnableJpaRepositories("com.thb.repository")
//@ComponentScan(basePackageClasses = {com.thb.controller.c})
@EnableJpaAuditing
public class MainApplication {

	public static void main(String args[])
	{
		
		SpringApplication.run(MainApplication.class, args);
	}
}
