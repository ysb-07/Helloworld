package OOPS.abstraction;

public class Test {

	public static void main(String[] args) {
		
		Person p1=new Employee();
		p1.doSomething();
		Person p2=new Student();
		p2.doSomething();
		Person p3=new HouseWife();
		p3.doSomething();
		Employee emp=new Employee();

	}

}
