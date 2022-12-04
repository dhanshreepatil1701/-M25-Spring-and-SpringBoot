package com.example.springdemo;

import org.springframework.stereotype.Component;

/*below annotation is used to denote that the class is a component 
 * its allows spring to automatically detect our custom beans */
@Component 
public class Employee {

	//private members
	private int emplyID;
	private String name;
		
	//getters and setters
	public int getEmplyID() {
		return emplyID;
	}

	public void setEmplyID(int emplyID) {
		this.emplyID = emplyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//user defined method 
	public void print() {
		System.out.println("Welcome to Java Full Stack");
	}
		
}
