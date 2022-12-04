package com.examples.demo;

import org.springframework.stereotype.Component;

/*below annotation is used to denote that the class is a component 
 * its allows spring to automatically detect our custom beans */
@Component 
public class Student {

	//private members
	private int rollno;
	private String name;
	
	//getters and setters
	/*public int getRollno() {
		return rollno;
	}*/
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	//user defined method 
	public void print() {
		System.out.println("Welcome to M25 Batch");
	}
	//default constructor
	public Student() {
		super();
		System.out.println("Welcome to TNS INDIA Foundation !");
	}
	
	

}
