package OOPs.abstraction;

public class Employee extends Person implements Artist, Player{
	public void doSomething() {
		System.out.println("An employee works to make his living");
	}
	public void doArt() {
		System.out.println("Employees are allowed to show their artistic side in cultureal activity in the org");
	}
	public void doPlay() {
		System.out.println("Inter location tournaments are held for employees who wants to participate");
	}
	public void do1() {
		System.out.println("implementing something doable from do interface");
	}

}
