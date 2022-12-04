package com.examples.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springdemo.Employee;


@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringStarterProjectApplication.class, args);
		/*int x=20;
		System.out.println("The value of x is: "+x);*/
		
		//Student s=new Student();
		//s.print();
		
		//Employee e=new Employee();
		//e.print();
		
		//IOC and DI
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		Student s=c.getBean(Student.class);
		s.print();
	}

}