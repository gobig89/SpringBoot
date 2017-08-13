package test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.Studentcontroller;

@SpringBootApplication
@ComponentScan(basePackages = {"services","controller","dao"})

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperties().put( "server.port", 8181 );
		SpringApplication.run(Main.class, args);

	}

}
