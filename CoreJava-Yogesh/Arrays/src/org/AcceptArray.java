package org;

import java.util.Scanner;
public class AcceptArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]*2;
			a[i]=arr[i];
		}
		for(int k=0;k<n;k++)
		System.out.println(a[k]);
	}

}
