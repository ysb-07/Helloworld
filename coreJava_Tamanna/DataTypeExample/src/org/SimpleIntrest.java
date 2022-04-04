package org;

import java.util.Scanner;

public class SimpleIntrest {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int P,I ,T;
	System.out.println("Enter Amount");
	P=scn.nextInt();
	System.out.println("Enter Intrest %");
	I=scn.nextInt();
	System.out.println("Enter Time ");
	T=scn.nextInt();
	System.out.println("Intrest Amount");
	System.out.println((P*I*T)/100);
}
}
