package org;

import java.util.Scanner;

public class AcceptInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=sc.next();
//		System.out.println("Enter your address");
//		String addr=sc.next();
//		System.out.println("Enter your age");
//		int age=sc.nextInt();
//		System.out.println("Enter the time now");
//		double time=sc.nextDouble();
//		
//		System.out.println("Hello "+name+" from "+addr+", you are "+age+" years old as of "+time);

		int a=5;
		int d=++a;
		int b=a++;
		int c=a;
		
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
	}

}
