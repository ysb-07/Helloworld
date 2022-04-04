package whileDoWhile;

import java.util.Scanner;

public class SimInterest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p=sc.nextInt();
     	System.out.println("Enter the rate");
		int r=sc.nextInt();
		
		int t=0;
		
		int si=0;
		
		while(si<100000)
		{
			si=(p*r*t)/100;
			t++;
		}
		System.out.println(t);

	}

}
