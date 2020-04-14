package com.revature.beans;
	//packages are fancy folders. creates a Namespace

/*
 *Naming Conventions
 *		Classes and Projects: Pascal casing, Capitalized first letter of each word
 *		Methods and Variables: Camel casing, ex. firstSecondThird
 *		Packages: lower case and delimited by periods
 *		Constants: ALL_CAPS delimited by underscore ex. PI 
*/

public class Human {
/*
 	* Members of a class
	* 		Instance variables - property of a specific object ex. Human's name
	* 		Static variable - property shared by all in class
	* 		Instance methods - behavior relative to a specific object 
	* 		Static methods - behavior shared by all in a class
	* 		Constructor- function that instantiates a class using the keyword "new"
*/
	private String name;
	private int age;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	// This method makes it easier to read
	
	
}
