package org;

import java.util.Scanner;

public class TestMutiDimArray {

	public static void main(String[] args) {
		int[][] nums=new int[3][3];
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nums[i][j]=scn.nextInt();
			}
		}

		System.out.println("Values in Arry are: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(nums[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
