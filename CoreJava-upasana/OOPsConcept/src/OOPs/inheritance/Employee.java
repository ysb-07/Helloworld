package OOPs.inheritance;

public class Employee extends Person{
	int empId;
	
	public Employee(String name,int age,String address,int empId)
	{
		//super() Person() capable of calling default constructor/ constructor without param
		super(name,age,address);
		this.empId=empId;
		System.out.println("Employee constructor");
	}
}
