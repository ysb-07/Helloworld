package OOPs.abstraction;

public abstract class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(){}
	
	public abstract void doSomething();//no body
	
	public void talk() {
		
	}
	
	//abstract methods exists in abstract class only
	//but an abstract class can have zero or more abstract method
	//Abstract class can have normal intance method as well
	
}
//binding the data with code
//keep the class as private as possible