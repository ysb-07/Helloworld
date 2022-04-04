package OOPs.Encapsulation;

public class Person {
	// mark public to access in d/f package
	private String name;
	private int age;
	private String address;

	public Person(){}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
}

//encapsulation 
// binding data with the code
//keep class as private as possible
