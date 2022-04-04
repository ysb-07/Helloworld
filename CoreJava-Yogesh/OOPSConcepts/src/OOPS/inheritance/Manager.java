package OOPS.inheritance;

public class Manager extends Employee {
	String dept;
	public Manager(String name, int age, String address, int empId, String dept)
	{
		super(name,age,address,empId);
		this.dept=dept;
		System.out.println("Manager constructor");
	}

}
