package org;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int[][] m1=new int[3][3];
		int[][] m2=new int[3][3];
		int[][] fin=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of m1");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		
        System.out.println("Enter values of m2");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		fin[i][j]=m1[i][j]+m2[i][j];
        	}
       
        }
        
        System.out.println("Sum is");
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(fin[i][j]+" ");
        	}
        	System.out.println();
        }
	
	}
}
	