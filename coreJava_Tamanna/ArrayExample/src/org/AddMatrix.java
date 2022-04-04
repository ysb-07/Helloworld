package org;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {


			int[][] nums=new int[3][3];
			int[][] num=new int[3][3];
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter values in 1st Array ");

			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					nums[i][j]=scn.nextInt();
				}
			}

			System.out.println("Enter values in 2nd Array ");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					num[i][j]=scn.nextInt();
				}
			}
			
			System.out.println("Matrix Added");
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(nums[i][j]+num[i][j]+" ");
				}
				System.out.println();
			}

			System.out.println("Matrix Multiplied");
			int[][] c=new int [3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					c[i][j]=0;
					for(int k=0;k<3;k++) {
						c[i][j]+=nums[i][k]+num[k][j];
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}

	}

}
