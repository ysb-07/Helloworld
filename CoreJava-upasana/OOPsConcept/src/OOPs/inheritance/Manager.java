package OOPs.inheritance;

public class Manager extends Employee{
	String dept;
	public Manager(String name,int age,String address,int empId,String dept)
	{
		//super() Employee()//calls the constructor of employee/parent class
		super(name,age,address,empId);
		this.dept=dept;
		System.out.println("Manager constructor");
	}

}
