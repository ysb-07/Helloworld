package org;

import org.Person;

public class Test {

	//Application execution point
	public static void main(String[] args) {
		Person p1=new Person();
		//this creates an object and allocates memory address to that object 
		p1.name="upasana";
		p1.age=32;
		p1.address="Bengaluru";
		System.out.println(p1.name+" is "+p1.age+" years old  and stays in "+p1.address);
		p1.talk();
		
		Person p2=new Person();
		//this creates an object and allocates memory address to that object 
		p2.name="Sreedevi";
		p2.age=22;
		p2.address="Hyderabad";
		System.out.println(p2.name+" is "+p2.age+" years old  and stays in "+p2.address);
		
		Student s1=new Student();
		s1.rollNo=1001;
		System.out.println(s1.rollNo);
		
		
	}

}
