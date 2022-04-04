package org;

public class TestArray {

	public static void main(String[] args) {
		//declare
		String[] names;

		//intantiate
		names=new String[5];
		
		//intialize
		names[0]="Tamanna";
		names[1]="Ashish";
		names[2]="Reena";
		names[3]="Mohit";
		names[4]="Aayu";
		//enhanced for loop
		for(String temp:names) {
			System.out.println(temp);
		}
		/*
		 * for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		 	}
		 */
	
		String[] cities= {"Mumbai","Kolkata","Bengalore","Delhi","Punes"};
		/*
		 * for(int i=0;i<cities.length;i++) {
		 
			System.out.println(cities[i]);
		}
		*/
		for(String temp:cities) {
			System.out.println(temp);
		}
		
		
		int[] num = new int[5];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		num[4]=500;
		
		/*for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		*/
		for(int temp:num) {
			System.out.println(temp);
		}
	}
	

}
