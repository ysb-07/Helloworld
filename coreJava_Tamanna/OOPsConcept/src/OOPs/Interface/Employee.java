package OOPs.Interface;


public class Employee extends Person implements Artist,Player{
	public void doSomething() {
		System.out.println("an employee works");
	}
	public void doArt()
	{
		System.out.println("Show ur art");
		
	}
	public void doplay()
	{
		System.out.println("Tournment coming up!");
	}
	public void do1()
	{
		System.out.println("Implementing doable");
	}
	

}
