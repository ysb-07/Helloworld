package OOPs.Inhritance;

public class Person {
	// mark public to access in d/f package
	 String name;
	 int age;
	 String address;

	public Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("Person Constructor");
	}
	
	/*public void setName(String name) {
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
	}*/
	
}

//encapsulation 
// binding data with the code
//keep class as private as possible
