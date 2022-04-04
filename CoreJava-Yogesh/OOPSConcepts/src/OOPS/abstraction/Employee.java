package OOPS.abstraction;

public class Employee extends Person implements Artist, Player {
	public void doSomething()
	{
		System.out.println("Employee Works");
	}
	public void doArt()
	{
		System.out.println("Employee Art");
	}
	public void doPlay()
	{
		System.out.println("Employee Plays");
	}
	public void do1()
	{
		System.out.println("Employee does something");
	}



}
