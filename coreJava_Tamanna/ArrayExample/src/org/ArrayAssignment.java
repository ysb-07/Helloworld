package org;

import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		int[] num=new int[4];
		Scanner scn=new Scanner(System.in);
		 int temp;
		for(int i=0;i<num.length;i++) {
			temp=scn.nextInt();
			num[i]=temp*2;
		}
		
		for(int temp1:num) {
			System.out.println(temp1);
		}
		
	}

}
