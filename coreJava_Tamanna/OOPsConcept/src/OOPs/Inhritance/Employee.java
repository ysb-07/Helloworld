package OOPs.Inhritance;

public class Employee extends Person {
	int empId;
	public Employee(String name,int age,String address,int empId) {
		super(name,age,address);
		this.empId=empId;
		System.out.println("Employee constructor");
	}
}
