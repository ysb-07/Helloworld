package org;

import java.util.Scanner;

public class TestMultiDArray {

	public static void main(String[] args) {
		int[][] nums=new int[3][3];
		System.out.println("Enter values of array");
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				nums[i][j]=sc.nextInt();
			}
		}
		System.out.println("The values of array are");
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(nums[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
