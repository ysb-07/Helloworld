package MethodExample;

public class Calculator {
	int x;
	int y;
	
	//accepts nothing returns nothing
	public void sum1()
	{
		System.out.println(x+y);
	}
	
	//accepts nothing returns something
		public int sum2()
		{
			return (x+y);
		}
		
	//accepts something returns something
		public int sum3(int a, int b)
		{
			return (a+b);
		}


    public void sum(int a, int b) {}
    public void sum(int a, int b, int x) {}
    public void sum(int a, float b) {}
    public void sum(float a, int b) {}
    
}
    
    
    
