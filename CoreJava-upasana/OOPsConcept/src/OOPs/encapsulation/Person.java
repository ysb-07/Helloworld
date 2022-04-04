package OOPs.encapsulation;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(){}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
//binding the data with code
//keep the class as private as possible