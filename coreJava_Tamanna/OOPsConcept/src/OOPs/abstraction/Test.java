package OOPs.abstraction;



public class Test {

	public static void main(String[] args) {
		//pure implementation
		Employee emp=new  Employee();
		emp.talk();
		//as person is abstract you can't call it through object like
		//Person p=new Person();
		//so we use polymorphic implementation
		
		Person p1=new Employee();
		p1.doSomething();
		Person p2=new Student();
		p2.doSomething();
		Person p3=new Housewife();
		p3.doSomething();
		
	}

}