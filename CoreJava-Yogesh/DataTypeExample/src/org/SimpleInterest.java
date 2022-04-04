package org;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p=sc.nextInt();
     	System.out.println("Enter the rate");
		double r=sc.nextDouble();
		System.out.println("Enter your time");
		int t=sc.nextInt();
		
		double interest=(p*r*t)/100;
		System.out.println("The simple interest is "+interest);

	}

}
