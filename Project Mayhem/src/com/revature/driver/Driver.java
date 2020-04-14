package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single comment

	/*
	 * Why Java? "WORA" Principle write once, run anywhere
	 * Owned by Oracle use to be owned by Sun Microsystem
	 * Industry standard version is 1.8 or "Java 8"
	 * 
	 * JVM - Java virtual machine
	 * 		converts complied java code into machine code for specific processor
	 * 		Provides portability
	 * JRE - Java runtime environment
	 * 		JVM + Libraries 
	 * 		Contains everything that we need to RUN Java
	 * JDK = Java Development Kit
	 * 		Contains the JVM + JRE
	 * 		Complier etc...
	 * 		Everything we need to WRITE Java
	 * 
	 * OOP - Object oriented programming
	 * 		unit of programmability is the object
	 * 		Objects - have states and behaviors
	 * 			States are properties, fields, attributes
	 * 			Behaviors are methods
	 * 		Classes - blueprint of an object  
	*/
	
	public static void main(String[] args) {
		/*
		 * Method signature
		 * 		Access modifiers
		 * 			public - anything within the project or that references the project
		 * 			static - do not need to instantiate to use/belongs to the class
		 * 			void - specifies that the functions will not return anything
		 * 		Parameters
		 * 			String[] args - can accept an array of strings
		 */
		System.out.println("Bear Down");
		Human h= new Human();
		System.out.println(h);
		h.setName("Brad");
		h.setAge(33);
		h.setWeight(180);
		System.out.println(h);
		System.out.println(h.getName());
	}
	
}
