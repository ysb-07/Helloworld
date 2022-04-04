package OOPs.inheritance;

public class Person {
	String name;
	int age;
	String address;

	public Person(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("Person constructor");
	}
	public Person() {}

}
//binding the data with code
//keep the class as private as possible