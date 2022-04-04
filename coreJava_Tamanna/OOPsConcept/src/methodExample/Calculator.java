package methodExample;

public class Calculator {
	int x ;
	int y;
	
	//accepts nothing returns nothing,just executes some code
	public void sum1() {
		System.out.println(x+y);
	}
	
	//accepts nothing returns something
	public int sum2() {
			return(x+y);
		}
	//accepts something returns something
	public int sum3(int a,int b) {
			return(a+b);
		}
	
	// Overloading
	//we can have multiple methods with same name with
	//1. number of arguments/parameters
	//2. order of the paras
	//3. type of the paras
	//return type f a method is not considered in method overloading
	
	public void sum(int a, int b) {}
	public void sum(int a, int b,int x) {}
	public void sum(int a, float b) {}
	public void sum(float a, int b) {}
}
